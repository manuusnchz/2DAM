# Tema 2 · Hilos

## Ejercicios

| Hoja | Contenido |
| --- | --- |
| [Ejercicios de hilos 1–3](Ejercicios/PSP_T2_Ejercicios_hilos_1-3.pdf) | Fibonacci, letras y sumatorias, cada uno con `Runnable` y con `Thread` |

## Ejemplos de clase

Cada ejemplo está en su propia carpeta (el número es la diapositiva del tema). Para ejecutarlo, entrad en la carpeta y usad `java Fichero.java`.

| Carpeta | Qué enseña |
| --- | --- |
| [`diap26_sin_esperas`](Ejemplos_de_clase/diap26_sin_esperas/) | El hilo y el `main` escriben a la vez: las X y las Y salen mezcladas |
| [`diap27_durmiendo`](Ejemplos_de_clase/diap27_durmiendo/) | El `main` duerme con `Thread.sleep()`: el hilo se adelanta, pero no hay orden garantizado |
| [`diap27_con_join`](Ejemplos_de_clase/diap27_con_join/) | El `main` espera con `join()`: primero todas las Y y después todas las X |
| [`diap31_prioridades`](Ejemplos_de_clase/diap31_prioridades/) | Prioridad 10 frente a 1: avanzan casi a la par (tarda unos 10 s) |
| [`diap34_recursos_compartidos`](Ejemplos_de_clase/diap34_recursos_compartidos/) | Dos hilos suman 3 y restan 4 a la misma variable |
| [`diap34_recursos_compartidos_millon`](Ejemplos_de_clase/diap34_recursos_compartidos_millon/) | Lo mismo con 1.000.000: **condición de carrera**, sale un número distinto cada vez |
| [`diap35_recursos_compartidos_mensajes`](Ejemplos_de_clase/diap35_recursos_compartidos_mensajes/) | Cada hilo escribe lo que hace: se ve cómo se pierden actualizaciones |

[⬅ Volver al inicio](../README.md)
