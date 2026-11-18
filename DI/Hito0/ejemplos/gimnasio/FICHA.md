# Ficha de mi aplicación · Hito 0 (EJEMPLO: gimnasio)

- **Alumno/a:** Nombre Apellidos
- **Temática:** gimnasio (Gimnasio Olimpo)
- **Qué gestiona:** socios

## Campos

| # | Campo | Tipo de dato | Componente | Ejemplo de valor / opciones |
|---|-------|--------------|------------|-----------------------------|
| 1 | Nombre | texto | campo de texto | Lucía Gómez |
| 2 | DNI | texto | campo de texto | 12345678A |
| 3 | Edad | entero | selector numérico | 27 |
| 4 | Cuota mensual | decimal | campo de texto | 34,90 |
| 5 | Tarifa | lista | lista desplegable | Básica / Premium / Estudiante |
| 6 | Turno | opción | botones de opción | Mañana / Tarde |
| 7 | Activo | sí/no | casilla | sí |

## Pantallas

| Pantalla | Foto |
|----------|------|
| Inicio de sesión | `bocetos/1_inicio_sesion.png` |
| Ventana principal | `bocetos/2_ventana_principal.png` |
| Formulario de alta | `bocetos/3_formulario.png` |

### Ventana principal

- **Menús y sus opciones:**
  - Archivo: Salir
  - Socios: Nuevo socio…, Listado
  - Ayuda: Acerca de…
- **Columnas de la tabla:** Nombre, DNI, Tarifa, Activo

### Qué hace cada botón

- Inicio de sesión › **Entrar**: comprueba el usuario y la contraseña y abre la ventana principal.
- Ventana principal › **Nuevo**: abre el formulario de alta vacío. **Editar**: abre el formulario con el socio seleccionado. **Borrar**: pide confirmación y borra el socio seleccionado.
- Formulario › **Guardar**: comprueba los campos y guarda. **Cancelar**: cierra sin guardar.

### Mensajes

- Si el usuario o la contraseña están mal: «Usuario o contraseña incorrectos.»
- Si falta un campo obligatorio en el formulario: «Escribe el nombre para poder guardar.»

## Bocetos

![Inicio de sesión](bocetos/1_inicio_sesion.png)

![Ventana principal](bocetos/2_ventana_principal.png)

![Formulario de alta](bocetos/3_formulario.png)
