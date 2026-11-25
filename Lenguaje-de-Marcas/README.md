# Lenguaje de Marcas (HTML y CSS)

Prácticas de la asignatura, ordenadas por bloques en el orden en que se han visto en clase. Cada carpeta de ejercicio es una página independiente con su HTML, su CSS y sus imágenes.

Todas son **prácticas de clase**: no hay enunciados escritos de estas prácticas, así que los archivos no llevan enunciado.

Para ver un ejercicio, abre su `index.html` en el navegador (o con la extensión *Live Server* de VS Code).

## Índice

### [01-fundamentos-html](01-fundamentos-html/) — estructura, tablas, imágenes, listas y formularios

| Carpeta | Qué es | Fecha |
|---|---|---|
| [01-primera-practica](01-fundamentos-html/01-primera-practica/) | Título, párrafo, tabla e imagen con una hoja de estilos | sep. 2026 |
| [02-formulario](01-fundamentos-html/02-formulario/) | Formulario sencillo con estilos y `:hover` | sep. 2026 |
| [03-listas](01-fundamentos-html/03-listas/) | Listas `ul`/`ol`, `list-style-type`, emojis y favicon | oct. 2026 |
| [04-tablas-y-formularios](01-fundamentos-html/04-tablas-y-formularios/) | Tabla con `thead`/`tbody`, formulario de texto y casillas | nov. 2026 |

### [02-css](02-css/) — hojas de estilo, selectores y cajas

| Carpeta | Qué es | Fecha |
|---|---|---|
| [01-primera-web](02-css/01-primera-web/) | Página con tabla de imágenes y CSS externo (`styles.css`). En [todo-junto/](02-css/01-primera-web/todo-junto/) está la misma página con el CSS interno (`<style>`) | sep. 2026 |
| [02-css-inicios](02-css/02-css-inicios/) | Clases, ids, enlaces entre ejercicios, márgenes y `div` anidados | oct.–nov. 2026 |

### [03-flexbox](03-flexbox/)

| Carpeta | Qué es | Fecha |
|---|---|---|
| [01-flexbox-bloques](03-flexbox/01-flexbox-bloques/) | Contenedor flex con bloques e imágenes y `flex-wrap` | nov. 2026 |
| [02-flexbox-propiedades](03-flexbox/02-flexbox-propiedades/) | Una caja por propiedad: `flex-direction`, `flex-wrap`, `flex-flow`, `justify-content`, `align-items`, `align-content` | nov. 2026 |

### [04-proyectos-web](04-proyectos-web/)

| Carpeta | Qué es | Fecha |
|---|---|---|
| [01-pagina-iphone](04-proyectos-web/01-pagina-iphone/) | Maqueta estilo web de Apple: barra de navegación, portada y cuadrícula de productos | nov. 2026 |

## Añadir un ejercicio nuevo

1. Elige el bloque (o crea el siguiente, p. ej. `05-...`).
2. Crea la carpeta `NN-nombre-del-ejercicio/` con su `index.html` y, al lado, su CSS e imágenes.
3. Usa rutas relativas dentro de la carpeta (`href="style.css"`, `src="foto.jpg"`), así la página sigue funcionando aunque se mueva.
4. Si el profesor da un enunciado escrito, cópialo al principio del HTML en un comentario `<!-- ... -->`.

## Rutas antiguas

Estas prácticas estaban en `tareas_clas/` y `tareas_clas_old/`. Ver [CORRESPONDENCIAS.md](CORRESPONDENCIAS.md).
