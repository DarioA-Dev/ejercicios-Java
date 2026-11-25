# Crea o "arma" una carpeta como proyecto Java aislado (equivalente a nbproject de NetBeans).
#
# Uso (rutas relativas a la carpeta Java/):
#   .\nuevo-proyecto.ps1 programacion\07-arrays\03-tarea-nueva          # carpeta nueva con Main.java
#   .\nuevo-proyecto.ps1 programacion\07-arrays\03-tarea-nueva -SinMain # solo metadatos
#   .\nuevo-proyecto.ps1 -Todos                                         # arma todas las carpetas con .java sin proyecto
#
# Cada carpeta de ejercicio pasa a ser un proyecto independiente: dos carpetas pueden tener una
# clase Main sin que el editor marque "duplicate class".
# El proyecto se llama "<carpeta-padre>_<carpeta>" (p. ej. 07-arrays_03-tarea-nueva) para que
# no se repitan nombres entre bloques.
[CmdletBinding()]
param(
    [Parameter(Position = 0)][string]$Ruta,
    [switch]$SinMain,
    [switch]$Todos,
    [string]$JavaVersion = '24'
)

$ErrorActionPreference = 'Stop'
$utf8 = New-Object System.Text.UTF8Encoding($false)
$base = $PSScriptRoot

function Escribir($path, $texto) {
    [System.IO.File]::WriteAllText($path, ($texto -replace "`r`n", "`n"), $utf8)
}

function Nombres-En-Uso($excluir) {
    Get-ChildItem $base -Recurse -Filter .project -File -Force |
        Where-Object { $_.DirectoryName -ne $excluir -and $_.FullName -notmatch 'oracleJdk' } |
        ForEach-Object { ([xml](Get-Content $_.FullName -Raw)).projectDescription.name }
}

function Armar-Proyecto($dir) {
    $nombre = (Split-Path (Split-Path $dir -Parent) -Leaf) + '_' + (Split-Path $dir -Leaf)
    if ((Nombres-En-Uso $dir) -contains $nombre) {
        throw "Ya existe otro proyecto llamado '$nombre'. Usa un nombre de carpeta distinto."
    }
    New-Item -ItemType Directory -Force (Join-Path $dir '.settings') | Out-Null

    Escribir (Join-Path $dir '.project') @"
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>$nombre</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
	</natures>
</projectDescription>
"@

    Escribir (Join-Path $dir '.classpath') @"
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="src" path=""/>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-$JavaVersion"/>
	<classpathentry kind="output" path="bin"/>
</classpath>
"@

    Escribir (Join-Path $dir '.settings\org.eclipse.jdt.core.prefs') @"
eclipse.preferences.version=1
org.eclipse.jdt.core.builder.resourceCopyExclusionFilter=*.launch,.project,.classpath
org.eclipse.jdt.core.compiler.codegen.targetPlatform=$JavaVersion
org.eclipse.jdt.core.compiler.compliance=$JavaVersion
org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
org.eclipse.jdt.core.compiler.release=enabled
org.eclipse.jdt.core.compiler.source=$JavaVersion
"@

    Escribir (Join-Path $dir '.settings\org.eclipse.core.resources.prefs') @"
eclipse.preferences.version=1
encoding/<project>=UTF-8
"@
    Write-Host "Proyecto armado: $dir"
}

if ($Todos) {
    # No se arman carpetas que ya contienen otros proyectos dentro (p. ej. entorno\ con un .java suelto)
    $proyectos = @(Get-ChildItem $base -Recurse -Filter .project -File -Force | ForEach-Object { $_.DirectoryName })
    Get-ChildItem $base -Recurse -Filter *.java -File |
        Where-Object { $_.FullName -notmatch 'oracleJdk|\\bin\\|\\out\\' } |
        ForEach-Object { $_.DirectoryName } | Sort-Object -Unique |
        Where-Object { -not (Test-Path (Join-Path $_ '.project')) } |
        Where-Object { $d = $_; -not ($proyectos | Where-Object { $_.StartsWith($d + '\') }) } |
        ForEach-Object { Armar-Proyecto $_ }
    return
}

if (-not $Ruta) { throw 'Indica la ruta de la carpeta, p. ej.: .\nuevo-proyecto.ps1 programacion\07-arrays\03-tarea-nueva' }
$dir = if ([System.IO.Path]::IsPathRooted($Ruta)) { $Ruta } else { Join-Path $base $Ruta }
New-Item -ItemType Directory -Force $dir | Out-Null
Armar-Proyecto $dir

$main = Join-Path $dir 'Main.java'
if (-not $SinMain -and -not (Get-ChildItem $dir -Filter *.java -File)) {
    Escribir $main @"
public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
}
"@
    Write-Host "Creado: $main"
}
Write-Host 'Si no aparece en el explorador de Java: Ctrl+Shift+P > "Java: Import Java Projects into Workspace".'
