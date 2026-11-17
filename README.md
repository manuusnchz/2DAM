# Programación de Servicios y Procesos (PSP)

**2.º DAM · Curso 2026-27** · Profesor: Manuel Peñas Sánchez

Aquí encontraréis el material de clase de PSP: los temas, las hojas de ejercicios y el código de los ejemplos que vemos en clase. Se irá completando a medida que avance el curso.

**Horario:** jueves de 18:15 a 19:15 y viernes de 17:15 a 19:15 (aula 5).

---

## 📚 Temas

| Tema | Contenido | Material |
| --- | --- | --- |
| **1 · Programación concurrente** | Procesos, estados, planificación, árbol de procesos, `ProcessBuilder` y `Process` | [Carpeta](T1_Programacion_concurrente/) |
| **2 · Hilos** | Hilos (`Runnable` y `Thread`), `join`, `sleep`, prioridades, sincronización, semáforos y monitores | [Carpeta](T2_Hilos/) |
| 3 · Comunicaciones en red | Sockets TCP y UDP | *Próximamente* |
| 4 · Servicios en red | Protocolos de aplicación, servidores multihilo | *Próximamente* |
| 5 · Programación segura | Hashes, cifrado y firma digital | *Próximamente* |

---

## 📤 Cómo entregar

Todas las entregas del curso (ejercicios y prácticas) se hacen en **vuestro propio repositorio de GitHub**.

1. Cread un repositorio **público** llamado `Nombre-Apellido-Entregas-PSP` (si ya tenéis uno para la asignatura, usad ese).
2. Poned el enlace en la **[hoja de repositorios](https://docs.google.com/spreadsheets/d/14x0ZBKWY_Y5vwGmHvtN-Jq7lY_9fn_n15T5UozazW1I/edit?usp=sharing)**: solo vuestro **nombre completo** y el **enlace**.
3. Organizad el repositorio **por temas**, con una carpeta por ejercicio o práctica, y usad los nombres de fichero que indica cada enunciado. Por ejemplo:

   ```
   T2_Hilos/
   └── Ejercicios_1-3/
       ├── FibonacciRunnable.java
       ├── FibonacciThread.java
       ├── LetrasThread.java
       ├── LetrasRunnable.java
       ├── SumasThread.java
       └── SumasRunnable.java
   ```

4. Haced `commit` **y** `push` antes del plazo. Lo que no está en GitHub no está entregado.

> ✅ **Antes de subir, comprobad el resultado** con el apartado «Para comprobarlo» de cada enunciado.
>
> ⚠️ Dos clases con el mismo nombre en la misma carpeta (el mismo paquete) no compilan juntas: dad a cada clase un nombre distinto.

---

## 💻 Entorno de trabajo

- **Visual Studio Code** con el *Extension Pack for Java*.
- **JDK 25** (Eclipse Temurin).
- Para ejecutar un ejemplo de un solo fichero no hace falta compilar:

  ```bash
  java Fichero.java
  ```

---

## 📝 Evaluación

| Parte | Peso |
| --- | --- |
| Exámenes | 40 % |
| Prácticas | 50 % |
| Tests | 10 % |

Hay que aprobar todos los exámenes y todas las prácticas.
