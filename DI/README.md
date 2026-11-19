[← Volver a 2.º DAM](../)

# Desarrollo de Interfaces (DI)

**2.º DAM · Curso 2026-27** · Profesor: Manuel Peñas Sánchez

Durante el curso construyes **tu propia aplicación de escritorio de gestión** en Java Swing. Es un único proyecto que crece hito a hito. Todo lo explica el **[enunciado del proyecto](Proyecto_DI_Enunciado.pdf)**.

**Horario:** lunes, jueves y viernes (2 h).

---

## 🗓️ Hitos del primer trimestre

| Hito | Qué | Se trabaja en clase | Fecha tope (23:59) | Peso |
| --- | --- | --- | --- | --- |
| **0** | Tu aplicación en papel: ficha y bocetos · [instrucciones](Hito0/) · [ejemplos](Hito0/ejemplos/) | jue 19/11 | dom 22/11 | 10 % |
| **1** | Ventanas, inicio de sesión y menú | hasta vie 27/11 | dom 29/11 | 25 % |
| **2** | Formulario y tabla | hasta vie 4/12 | mié 9/12 | 30 % |
| **3** | Componente propio y guardar datos | hasta jue 17/12 | jue 17/12 | 35 % |

Defensas: **viernes 18/12** (5 minutos cada uno).

Los hitos están pensados para terminarlos en clase. Si no te da tiempo, lo terminas en casa antes de la fecha tope, sin perder nota.

---

## 📤 Cómo entregar

1. Un repositorio **público** llamado `DI-Nombre-Apellido` (sin tildes ni espacios), **uno solo para todo el curso**.
2. Pon tu usuario de GitHub, el enlace y tu temática en la **hoja de repositorios de DI** (te la paso en clase).
3. Estructura obligatoria (proyecto Maven `dam.di` / `proyecto-di`, clase principal `dam.di.Aplicacion`, Java 25):

   ```
   DI-Lucia-Gomez/
   ├── README.md          ← nombre, temática, IDE, usuario y contraseña del login, estado de cada hito
   ├── FICHA.md           ← Hito 0
   ├── .gitignore
   ├── bocetos/           ← fotos del Hito 0
   ├── pom.xml
   └── src/main/java/dam/di/
       └── Aplicacion.java
   ```

4. De cada hito se corrige **el último commit subido antes de su fecha tope**.

---

## 📚 Material

| | |
| --- | --- |
| [Enunciado del proyecto](Proyecto_DI_Enunciado.pdf) | Normas, requisitos de cada hito y evaluación |
| [Diapositivas de la sesión 1 (jue 19/11)](T1_Introduccion_diseno_interfaces/Sesion01_Diapositivas.pdf) | Presentación, T1, «¿Qué falla en esta pantalla?», Hito 0 y puesta en marcha (IDE, proyecto Maven y repositorio) |
| [Hito 0](Hito0/) | Plantilla `FICHA.md`, ejemplo y plantilla de bocetos (opcional) |
| [Ejemplos del Hito 0](Hito0/ejemplos/) | Tres ejemplos completos (ficha + bocetos): gimnasio, biblioteca y taller |
