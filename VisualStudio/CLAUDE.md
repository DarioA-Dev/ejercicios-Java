# Instrucciones para agentes (Claude Code u otros)

Contexto del repositorio académico de un estudiante de 1º DAM. Léelo antes de añadir, mover o documentar nada: así no hace falta volver a analizar todo el repositorio.

## Repositorio

- Remoto: `DarioA-Dev/ejercicios-Java` (no renombrarlo: hay enlaces entregados en Teams).
- **Rama de trabajo: `main`.** Contiene todas las asignaturas.
- `java` y `lenguaje-marcas` son ramas **archivadas**: no se modifican, no se borran (los enlaces antiguos de Teams apuntan a ellas) y no se fusionan de nuevo.

```
./
├── README.md                     # portal de entrada
├── Java/
│   ├── Java.code-workspace       # abrir en VS Code (raíces: programacion y entorno)
│   ├── nuevo-proyecto.ps1        # crea carpetas-proyecto Java
│   ├── programacion/             # asignatura Programación
│   │   ├── 01-fundamentos/ … 07-arrays/
│   │   ├── 90-practicas-personales/
│   │   ├── 99-pendientes-de-identificar/
│   │   ├── README.md             # índice con todas las tareas
│   │   └── CORRESPONDENCIAS.md   # rutas antiguas -> nuevas
│   └── entorno/                  # asignatura Entornos de Desarrollo
│       ├── 01-poo-personaje/
│       └── apuntes/              # apuntes en HTML
├── Lenguaje-de-Marcas/           # asignatura Lenguaje de Marcas (HTML/CSS)
│   ├── 01-fundamentos-html/ 02-css/ 03-flexbox/ 04-proyectos-web/
│   ├── README.md
│   └── CORRESPONDENCIAS.md
└── VisualStudio/                 # este vault de Obsidian
```

`El-nexo-COMMIT/` es un proyecto independiente que está en `.gitignore`; no forma parte del repositorio académico.

## Asignaturas

| Asignatura | Carpeta | Qué hay |
|---|---|---|
| Programación | `Java/programacion/` | Ejercicios por bloques y las tareas de Teams (`NN-tarea-*`) con su enunciado literal |
| Entornos de Desarrollo | `Java/entorno/` | Proyecto de POO con herencia y apuntes. Usa Java pero es otra asignatura: no mezclar con Programación |
| Lenguaje de Marcas | `Lenguaje-de-Marcas/` | Prácticas de clase de HTML y CSS, una carpeta por página |

## Convenciones de nombres

- Carpetas de bloque: `NN-nombre-en-minusculas` (`05-ejercicios-combinados`). `90-` personales, `99-` pendientes de identificar.
- Carpetas de ejercicio: `NN-nombre`. Si es una tarea de Teams: `NN-tarea-<titulo>`.
- Java: clases en PascalCase, el archivo se llama igual que su clase pública y **no** se usa `package` (los nombres de carpeta con guiones no son paquetes válidos).
- Java: cada carpeta de ejercicio es un proyecto Eclipse/VS Code independiente (`.project` + `.classpath`), llamado `<bloque>_<carpeta>`. Se crea con `Java/nuevo-proyecto.ps1 programacion\<bloque>\<carpeta>` (o con `-Todos` para carpetas que ya tienen `.java`).
- HTML: cada ejercicio tiene su `index.html` y, en la misma carpeta, su CSS e imágenes, enlazados con rutas relativas.

## Dónde guardar un ejercicio nuevo

1. Programación: en el bloque del tema; si es un tema nuevo, bloque nuevo con el número siguiente (`08-...`).
2. Lenguaje de Marcas: en su bloque, o bloque nuevo (`05-...`).
3. Entornos de Desarrollo: carpeta nueva `NN-nombre` en `Java/entorno/`.
4. Ejercicios propios: `90-practicas-personales/`. Origen desconocido: `99-pendientes-de-identificar/`, clasificados por concepto.
5. Añadir la fila correspondiente al README de la asignatura y, si procede, al índice de la asignatura en Obsidian.

## Enunciados originales

- Solo en tareas cuyo enunciado escrito existe (Teams). Va **al principio del archivo**, literal (sin corregir faltas ni reformular):
  - Java: `/*` + título de la tarea en mayúsculas + línea ` *` en blanco + texto con ` * ` delante de cada línea + ` */`.
  - HTML: comentario `<!-- ... -->` al principio.
- Si una tarea no tiene enunciado escrito, se indica en una línea ("Enunciado original no disponible") y no se reconstruye.
- Nunca inventar enunciados ni atribuir al profesor texto que no ha escrito.

## Nivel de programación y conservación

- Es el repositorio de un alumno que está aprendiendo. **No corregir, modernizar ni refactorizar** soluciones existentes, aunque tengan errores: representan su aprendizaje.
- Cambios permitidos en código existente: renombrar archivo/clase (con su constructor y referencias), rutas relativas y `package`/`import` cuando una ubicación cambie, y añadir enunciados.
- Si se pide escribir una solución nueva: nivel principiante y solo lo visto en clase (variables, `if`/`else`, `switch`, `for`/`while`, contadores, acumuladores, métodos sencillos, clases con constructor, `static` y arrays). Nada de streams, lambdas, colecciones, `Arrays.sort()`/`Arrays.toString()`, patrones ni dependencias externas. Mismo estilo que los ejercicios del alumno (variables en inglés, mensajes en español).
- HTML/CSS: no cambiar el diseño ni "mejorar" las páginas.

## Evitar duplicados

- Antes de crear algo, buscar en el README de la asignatura y con `git grep`.
- Versiones del mismo ejercicio: misma carpeta (como `02-css/01-primera-web/todo-junto/`). Una copia redundante solo se retira si su contenido está en el historial, y se anota en `CORRESPONDENCIAS.md`.
- Al mover archivos: `git mv` y apuntar ruta antigua -> nueva en `CORRESPONDENCIAS.md`.

## Obsidian (este vault)

```
VisualStudio/
├── Indice.md                     # nota de entrada: enlaza todo
├── 00 Inbox/Inbox.md             # notas sin clasificar
├── 01 Asignaturas/
│   ├── Programación/Programación.md
│   ├── Entornos de Desarrollo/Entornos de Desarrollo.md
│   └── Lenguaje de Marcas/Lenguaje de Marcas.md
├── 02 Plantillas/                # Apunte de clase, Ejercicio, Repaso examen
└── 03 Recursos/                  # adjuntos (attachmentFolderPath)
```

- Cada asignatura tiene una nota índice (MOC) con sus bloques, apuntes, ejercicios documentados y repasos. Toda asignatura nueva: carpeta en `01 Asignaturas/` + MOC enlazado desde `Indice.md`.
- Las notas se crean con las plantillas (`Templates: Insert template`). Propiedades: `asignatura` (igual que el nombre de su carpeta), `tags` (`apunte`, `ejercicio`, `repaso` o `moc`).
- Entre notas se usan `[[wikilinks]]`. El código está **fuera** del vault y los wikilinks no llegan ahí: se indica la ruta en texto (`Java/programacion/07-arrays/`) y se enlaza en GitHub (`https://github.com/DarioA-Dev/ejercicios-Java/tree/main/<ruta>`).
- No copiar código dentro del vault: Obsidian es para apuntes, explicaciones y navegación.
- Al mover o renombrar carpetas de código, actualizar los enlaces de los MOC de la asignatura.
- `.obsidian/workspace.json` es estado de la interfaz y no se versiona. No hay plugins de comunidad; no añadirlos.

## Comprobar y hacer commits

- Java: compilar cada carpeta-proyecto por separado (`javac -encoding UTF-8 -d <tmp> <carpeta>/*.java`). Nunca todo el repositorio a la vez.
- HTML: comprobar que cada `href`/`src` local existe.
- No versionar `bin/`, `out/`, `*.class` ni JDK descargados (ya están en `.gitignore`).
- Commits en español, descriptivos y separados por tipo de cambio (organización, contenido, documentación). Push normal a `main`; nunca `push --force`.
