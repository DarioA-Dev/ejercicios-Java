# Ejercicios de Java

Carpeta de aprendizaje. Cada subcarpeta es un ejercicio independiente y suelto (sin relación entre ellos), compilable por sí solo con `javac` (sin `package`, sin proyecto NetBeans).

- `01-tipos-de-datos-primitivos/` — tipos primitivos (boolean, char, byte, short, int, long, float, double, String).
- `02-condicionales-y-teclado/` — condicionales (if/else) y entrada por teclado con `Scanner`. Contiene ejercicios previos comentados como historial. **El ejercicio activo (importe de compra) no compila tal cual**: falta poner llaves `{ }` en el `if` de fuera y sobra una `}` al final.
- `03-banco-de-pruebas/` — pruebas sueltas / plantilla vacía para probar cosas rápido.
- `04-poo-personaje/` — programación orientada a objetos: clase `Personaje` (atributos, constructor, getters/setters) instanciada desde `Main`.

Para compilar y ejecutar un ejercicio:

```
cd 04-poo-personaje
javac *.java
java Main
```

## Entorno VS Code (proyectos aislados, como NetBeans)

Cada carpeta con `.java` es un proyecto independiente gracias a su `.project` + `.classpath`
(el equivalente a `nbproject/`). Así dos carpetas pueden tener una clase `Main` sin conflictos.

- **Proyecto nuevo**: `Ctrl+Shift+P` → *Tasks: Run Task* → *Java: nuevo proyecto*
  (o `.\nuevo-proyecto.ps1 programacion\13-mi-ejercicio`). Crea la carpeta, los metadatos y un `Main.java`.
- **Carpeta que ya tenías suelta**: tarea *Java: armar carpetas sin proyecto*.
- Si el proyecto no aparece: `Ctrl+Shift+P` → *Java: Import Java Projects into Workspace*.
- Si ves errores raros tras cambios de configuración: *Java: Clean Java Language Server Workspace*.
- Usa **un solo** servidor de Java: `redhat.java` (Extension Pack for Java). No instales a la vez
  `oracle.oracle-java` ni `apache-netbeans-java`: se pisan y generan errores falsos.
- Los ficheros no llevan `package` (el nombre de carpeta como package, p. ej. `09-repaso-for`, es inválido).