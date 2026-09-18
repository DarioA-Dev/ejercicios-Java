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
