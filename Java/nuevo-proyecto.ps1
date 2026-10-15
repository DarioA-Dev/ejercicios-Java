# Crea o "arma" una carpeta como proyecto Java aislado (equivalente a nbproject de NetBeans).
#
# Uso:
#   .\nuevo-proyecto.ps1 programacion\13-mi-ejercicio          # carpeta nueva con Main.java
#   .\nuevo-proyecto.ps1 programacion\13-mi-ejercicio -SinMain # solo metadatos
#   .\nuevo-proyecto.ps1 -Todos                                # arma todas las carpetas con .java sin proyecto
#
# Cada carpeta pasa a ser un proyecto independiente: dos carpetas pueden tener una clase Main
# sin que el editor marque "duplicate class".
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
    $nombre = Split-Path $dir -Leaf
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
    Get-ChildItem $base -Recurse -Filter *.java -File |
        Where-Object { $_.FullName -notmatch 'oracleJdk|\\bin\\|\\out\\' } |
        ForEach-Object { $_.DirectoryName } | Sort-Object -Unique |
        Where-Object { -not (Test-Path (Join-Path $_ '.project')) } |
        ForEach-Object { Armar-Proyecto $_ }
    return
}

if (-not $Ruta) { throw 'Indica la ruta de la carpeta, p. ej.: .\nuevo-proyecto.ps1 programacion\13-ejercicio' }
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
