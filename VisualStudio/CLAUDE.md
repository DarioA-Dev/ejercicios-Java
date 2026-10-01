# Vault de Obsidian — Apuntes de clase

Este `CLAUDE.md` es el contexto que debe leer cualquier IA (Claude Code u otra)
antes de crear, mover o reorganizar notas en este vault. El objetivo del vault
es llevar apuntes de las asignaturas cuyo código vive en las carpetas hermanas
del repo (`../Java`, `../tareas_clas`, `../TCL-II`, etc.).

## Estructura de carpetas

```
VisualStudio/
├── Indice.md                  # Nota de entrada (MOC general del vault)
├── CLAUDE.md                  # Este archivo
├── 00 Inbox/                  # Capturas rápidas sin clasificar todavía
├── 01 Asignaturas/
│   ├── Java/
│   │   └── Java.md            # MOC de la asignatura (índice de sus notas)
│   ├── Lenguaje de Marcas/
│   │   └── Lenguaje de Marcas.md
│   └── TCL-II/
│       └── TCL-II.md
├── 02 Plantillas/             # Plantillas del plugin "Templates" (core)
└── 03 Recursos/               # Adjuntos: imágenes, PDFs, capturas
```

Reglas:

- Cada asignatura nueva se añade como subcarpeta de `01 Asignaturas/` con su
  propia nota MOC (`<Asignatura>.md`) que enlaza a sus notas de tema.
- Las notas sueltas o sin clasificar van primero a `00 Inbox/` y se mueven
  después a su asignatura.
- Los adjuntos (imágenes, PDFs) van a `03 Recursos/`; es la carpeta configurada
  como `attachmentFolderPath` en `.obsidian/app.json`.
- Las plantillas nuevas van a `02 Plantillas/` (carpeta configurada en
  `.obsidian/templates.json`).

## Convención de front-matter

Toda nota de asignatura o ejercicio debe llevar estas propiedades al inicio:

```yaml
---
asignatura: Java
tema: Programación orientada a objetos
fecha: 2026-09-23
tags: [apunte]
relacionado_con: "[[../../Java/04-poo-personaje]]"  # ruta relativa al código, si aplica
---
```

- `asignatura`: debe coincidir con el nombre de carpeta en `01 Asignaturas/`.
- `relacionado_con`: si el apunte documenta un ejercicio de código, enlaza (o al
  menos referencia en texto) la ruta real del ejercicio en el repo, p. ej.
  `../Java/04-poo-personaje/`. Obsidian no puede enlazar fuera del vault con
  `[[wikilink]]`, así que usa una ruta relativa en texto o un enlace Markdown:
  `[04-poo-personaje](../../Java/04-poo-personaje/Main.java)`.

## Plantillas disponibles

- `Plantilla - Apunte de clase.md`: para teoría explicada en clase.
- `Plantilla - Ejercicio.md`: para documentar un ejercicio de código ya hecho
  en `Java/`, `tareas_clas/`, etc. (qué pedía, cómo se resolvió, qué se aprendió).
- `Plantilla - Repaso examen.md`: checklist de repaso antes de un examen.

Al crear una nota nueva de apunte o ejercicio, usa la plantilla correspondiente
en vez de escribir la estructura a mano.

## Qué debe hacer la IA aquí

- Antes de crear una nota, comprobar si ya existe un MOC de esa asignatura en
  `01 Asignaturas/`; si no existe, crearlo primero y enlazarlo desde `Indice.md`.
- Nunca fusionar `TCL-II/` (nota del vault) con la carpeta `../TCL-II` del repo:
  esta última es un proyecto de código grande e independiente (no apuntes de
  clase), se referencia pero no se documenta nota a nota.
- Mantener `Indice.md` como único punto de entrada: cualquier MOC de asignatura
  nueva debe quedar enlazado ahí.
- No usar plugins de IA de Obsidian (Smart Connections, Copilot, etc.): este
  vault no los tiene instalados; la ayuda de IA se hace desde fuera (Claude Code).
