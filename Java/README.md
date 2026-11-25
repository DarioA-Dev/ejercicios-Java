# Java

Código Java de dos asignaturas, cada una en su carpeta:

- [`programacion/`](programacion/) — **Programación**: ejercicios y tareas de Teams ordenados por bloques (fundamentos, condicionales, switch, bucles, POO, arrays...). El índice está en su [README](programacion/README.md).
- [`entorno/`](entorno/) — **Entornos de Desarrollo**: proyecto de POO con herencia ([`01-poo-personaje`](entorno/01-poo-personaje/), con su explicación en `EXPLICACION.md`) y los apuntes del tema 1 en HTML ([`apuntes/tema1-entornos-de-desarrollo.html`](entorno/apuntes/tema1-entornos-de-desarrollo.html), se abre en el navegador).

## Abrir en VS Code

Abre `Java.code-workspace` (*File → Open Workspace from File...*). Tiene dos carpetas, Programación y Entornos de Desarrollo, y usa el JDK 24.

Cada carpeta de ejercicio tiene su `.project` + `.classpath` (el equivalente al `nbproject/` de NetBeans), así que es un proyecto independiente: dos carpetas pueden tener una clase `Main` sin conflictos.

- **Ejercicio nuevo**: `Ctrl+Shift+P` → *Tasks: Run Task* → *Java: nuevo proyecto*, o desde esta carpeta:
  `.\nuevo-proyecto.ps1 programacion\07-arrays\03-tarea-nueva`. Crea la carpeta, los metadatos y un `Main.java`.
- **Carpeta que ya tenía archivos .java sin proyecto**: tarea *Java: armar carpetas sin proyecto* (`.\nuevo-proyecto.ps1 -Todos`).
- Si un proyecto no aparece: `Ctrl+Shift+P` → *Java: Import Java Projects into Workspace*.
- Si salen errores raros después de mover cosas: *Java: Clean Java Language Server Workspace*.
- Usa **un solo** servidor de Java: `redhat.java` (Extension Pack for Java). No instales a la vez `oracle.oracle-java` ni `apache-netbeans-java`: se pisan y dan errores falsos.

## Compilar desde la terminal

Los ejercicios no llevan `package` (los nombres de carpeta con guiones, como `07-arrays`, no valen como package). Se compilan dentro de su carpeta:

```
cd programacion/07-arrays/02-tarea-arrays2
javac Ejercicio3OrdenarArray.java
java Ejercicio3OrdenarArray
```

Las salidas de compilación (`bin/`, `out/`, `*.class`) están en el `.gitignore`.
