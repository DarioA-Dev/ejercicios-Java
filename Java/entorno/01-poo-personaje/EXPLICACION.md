# Explicación del proyecto "Personaje" (Java, POO)

Este documento explica, en lenguaje normal, qué hace cada archivo del proyecto y por qué.

---

## 1. La idea general (lo más importante)

Imagina un videojuego. Hay personajes: un guerrero, un mago, un curandero...
Todos tienen cosas en común (vida, fuerza, velocidad, nombre) y todos pueden **atacar**.
Pero cada tipo hace cosas distintas: el mago ataca con magia, el curandero cura.

En Java esto se resuelve con **clases**:

- Una **clase** es un **molde** o plano. Dice "un personaje tiene vida, fuerza, nombre...".
- Un **objeto** es algo **real creado a partir del molde**. "Anastasio" es un objeto
  creado con el molde `Personaje`. "Gandalf" es otro objeto creado con el molde `Mago`.

Analogía: la clase es el molde de galletas; los objetos son las galletas.

El archivo del proyecto:

| Archivo | Para qué sirve |
|---|---|
| `Personaje.java` | El molde **base**. Lo que tienen todos los personajes. |
| `Mago.java` | Un tipo especial de personaje con **mana**, que ataca con magia. |
| `healer.java` | Un tipo especial de personaje con **mana**, que **cura**. |
| `Npc.java` | Una clase vacía, preparada por si se quiere usar más adelante. |
| `Main.java` | El programa que **se ejecuta**: crea personajes y los hace actuar. |

---

## 2. `Personaje.java` — el molde base

```java
public class Personaje {
```
Aquí se declara la clase. `public` significa que cualquiera puede usarla.

### Atributos (lo que "tiene" un personaje)

```java
private int vida;
private int fuerza;
public int velocidad;
private String nombre;
```

- `int` = número entero. `String` = texto.
- `private` = **privado**: solo se puede tocar desde dentro de la propia clase.
  Es como el cajón de tu casa: los de fuera no pueden meter la mano directamente.
- `public` = **público**: cualquiera puede leerlo y cambiarlo directamente.
  (Fíjate: `velocidad` es público, por eso en `Main` se puede hacer
  `personajeprincipal.velocidad = 1000` sin usar ningún método.)

### El constructor (cómo se "fabrica" un personaje)

```java
public Personaje(int vida, int fuerza, int velocidad, String nombre){
    this.vida = vida;
    this.fuerza = fuerza;
    this.velocidad = velocidad;
    this.nombre = nombre;
}
```

El constructor es una **receta de fabricación**. Se ejecuta al crear un personaje con `new`.
Recibe los datos y los guarda dentro del objeto.

¿Qué es `this.vida = vida`? Hay dos "vida":
- `this.vida` → la vida **del objeto** (el atributo).
- `vida` (a secas) → el dato que llega al constructor.

Se lee: "mi vida pasa a valer lo que me han dado".

### Getters y setters (la puerta de entrada a los datos privados)

Como `vida` es privado, desde fuera no puedes hacer `personaje.vida`. Para eso hay dos tipos de métodos:

```java
public int getVida(){ return vida; }     // GET = "dame" el valor
public void setVida(int x){ vida = x; }  // SET = "cambia" el valor
```

- **get** → te devuelve el dato (`return`).
- **set** → te deja cambiarlo. `void` significa "no devuelve nada, solo hace algo".

Hay un par de estos para `vida`, `fuerza` y `nombre`.

### El método `atacar`

```java
public void atacar(Personaje objetivo){
    objetivo.vida = objetivo.vida - fuerza;
}
```

Un personaje normal ataca a otro **restándole vida igual a su fuerza**.
- `objetivo` es el personaje que recibe el golpe.
- `fuerza` (sin nada delante) es la fuerza **del que ataca**.

Ejemplo: si ataca alguien con fuerza 50 a alguien con vida 100, el objetivo se queda en 50.

---

## 3. `Mago.java` — herencia

```java
public class Mago extends Personaje {
```

`extends Personaje` es la **herencia**. Significa: "un Mago **es un** Personaje, y
hereda todo lo que tiene Personaje (vida, fuerza, nombre, getters, setters...)
sin que tengamos que copiarlo otra vez".

Solo escribimos **lo nuevo** que tiene el Mago:

```java
private int mana;
```

### Constructor del Mago

```java
public Mago(int vida, int fuerza, int velocidad, String nombre, int mana) {
    super(vida, fuerza, velocidad, nombre);
    this.mana = mana;
}
```

- `super(...)` = "llama al constructor del padre (Personaje)" para que rellene
  vida, fuerza, velocidad y nombre.
- Después, el Mago guarda lo suyo: el `mana`.

### Polimorfismo: cambiar cómo ataca

```java
@Override
public void atacar(Personaje objetivo){
    int varVida = objetivo.getVida();
    varVida = varVida - mana;
    objetivo.setVida(varVida);

    objetivo.velocidad = objetivo.velocidad - mana;
}
```

- `@Override` = "voy a **reescribir** un método que heredé del padre".
- El Mago ataca **distinto** que un personaje normal: en vez de usar la fuerza, usa el **mana**.
- Además de quitar vida, **le baja la velocidad** al objetivo (lo ralentiza).

Esto es el **polimorfismo**: el mismo nombre de método (`atacar`) hace cosas
diferentes según quién lo use.

Fíjate que aquí se usa `getVida()` y `setVida()` en vez de `objetivo.vida`.
Es porque `vida` es privado y el Mago está en **otra clase**, así que tiene que pasar por la "puerta".
(Dentro de `Personaje` sí se puede hacer `objetivo.vida` porque es la misma clase.)

---

## 4. `healer.java` — el curandero

Funciona parecido al Mago (hereda de `Personaje`, tiene `mana`), pero además de atacar puede **curar**:

```java
public void curar(Personaje objetivo){
    int varVida = objetivo.getVida();
    varVida = varVida + mana;
    objetivo.setVida(varVida);
}
```

- `curar` coge la vida del objetivo, le **suma** el mana y la guarda de nuevo.
- Se usa así: `sanador.curar(aliado)`.
- El healer **no reescribe** `atacar`, así que si llamas a `sanador.atacar(x)` hace el ataque normal heredado de `Personaje` (resta vida según su fuerza).

---

## 5. `Npc.java`

```java
public class Npc {
}
```

Está vacía. NPC significa "personaje no jugable" (los que controla el juego, como un tendero).
Es un hueco para ampliar el proyecto más adelante. No hace nada ahora mismo.

---

## 6. `Main.java` — donde todo ocurre

```java
public static void main(String[] args) {
```

Es el **punto de arranque**. Cuando ejecutas el programa, Java empieza aquí
y lee las líneas de arriba abajo, una a una.

`System.out.println("...")` = "escribe este texto en pantalla".

### Paso a paso

**1) Crear un personaje**
```java
Personaje personajeprincipal = new Personaje(100, 50, 2000, "Anastasio");
```
Se divide en partes:
- `Personaje` → el tipo (el molde).
- `personajeprincipal` → el nombre de la variable (cómo lo llamamos nosotros).
- `new Personaje(...)` → crea el objeto con el constructor.
  Los números son: vida 100, fuerza 50, velocidad 2000, nombre "Anastasio".

**2) Cambiarle cosas**
```java
personajeprincipal.setNombre("Perico Anastasio");
personajeprincipal.velocidad = 1000;
```
- El nombre se cambia con el **setter** (porque es privado).
- La velocidad se cambia **directamente** (porque es pública).

**3) Mostrar el nombre**
```java
System.out.println("El nombre del personaje es..." + personajeprincipal.getNombre());
```
El `+` pega textos. Sale: `El nombre del personaje es...Perico Anastasio`.

**4) Crear un mago**
```java
Mago personajesecundario = new Mago(50, 50, 2000, "Gandalf", 50);
```
Vida 50, fuerza 50, velocidad 2000, nombre "Gandalf" y mana 50.

**5) Mostrar la vida de Perico**
```java
int mostrarvida = 0;
mostrarvida = personajeprincipal.getVida();
```
Se guarda la vida (100) en una variable y se imprime.

**6) Gandalf ataca a Perico**
```java
personajesecundario.atacar(personajeprincipal);
```
Como Gandalf es un `Mago`, se ejecuta el `atacar` **del Mago**, no el del Personaje:
- Vida de Perico: 100 − 50 (mana) = **50**
- Velocidad de Perico: 1000 − 50 (mana) = **950**

### Lo que se verá en pantalla al ejecutarlo

```
MUNDO DE PRUEBA
Vamos a instanciar un personaje
El nombre del personaje es...Perico Anastasio
la vida de Perico Anastasio es: 100
el mana de Gandalf es: 50
la vida de Perico Anastasio es: 50
la velocidad de Perico Anastasio es: 950
```

---

## 7. Cómo probar el healer

`Main` no usa el healer todavía. Para probarlo, añade al final del `main`:

```java
healer sanador = new healer(80, 10, 1500, "Sanador", 30);
sanador.curar(personajeprincipal);
System.out.println("vida tras curar: " + personajeprincipal.getVida()); // 50 + 30 = 80
```

---

## 8. Chuleta de conceptos

| Palabra | Significado sencillo |
|---|---|
| **Clase** | El molde. |
| **Objeto** | Algo creado a partir de un molde. |
| **`new`** | "Fabrica un objeto nuevo". |
| **Atributo** | Un dato que guarda el objeto (vida, nombre...). |
| **Método** | Una acción que sabe hacer el objeto (atacar, curar...). |
| **Constructor** | La receta que rellena el objeto al crearlo. |
| **`private` / `public`** | Quién puede tocar el dato: solo la clase / cualquiera. |
| **Getter / Setter** | Métodos para leer / cambiar datos privados. |
| **`extends`** | Herencia: "soy un tipo especial de...". |
| **`super`** | Llamar al padre. |
| **`@Override`** | Reescribir un método heredado. |
| **Polimorfismo** | Mismo nombre de método, comportamiento distinto según el objeto. |
| **`this`** | "Yo mismo" (el objeto actual). |
| **`void`** | El método no devuelve nada. |
| **`return`** | El método devuelve un valor. |
