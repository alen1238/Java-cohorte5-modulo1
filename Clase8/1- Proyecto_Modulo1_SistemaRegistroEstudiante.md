# Proyecto del Módulo 1: Sistema Básico de Registro de Estudiantes

Este proyecto te permitirá consolidar todos los conocimientos del Módulo 1 y, además, incorporar nuevas funcionalidades para hacer el sistema más
completo y realista.

## Objetivo del Proyecto

Desarrollar un programa en consola que simule un sistema básico de registro y consulta de información de un estudiante, utilizando **funciones**, **estructuras condicionales**, **bucles**, **validaciones** y **variables de alcance de clase**.\
El programa debe ser modular, fácil de leer y mantener.

## Requisitos Generales

-   El programa debe estar contenido en **una sola clase Java**.
-   El método `main` solo debe encargarse de **controlar el flujo del programa** (mostrar el menú y llamar a los métodos correspondientes).
-   Cada funcionalidad debe implementarse en un **método
    independiente**.
-   Se deben usar variables estáticas para guardar los datos del estudiante actual.

------------------------------------------------------------------------

## Funcionalidades a Implementar (como Métodos)

### 1. Mostrar Menú Principal

Debe imprimir las opciones disponibles para el usuario:

``` text
--- Sistema de Registro de Estudiantes ---

1. Registrar datos de un estudiante
2. Mostrar datos del estudiante actual
3. Calcular promedio de notas
4. Mostrar resumen completo del estudiante
5. Limpiar datos del estudiante actual
0. Salir
Ingrese su opción:
```

------------------------------------------------------------------------

### 2. Registrar la Información de un Estudiante

-   Solicita el **nombre** y **tres notas** al usuario.
-   Antes de registrar, si ya existe un estudiante guardado, el sistema
    debe **preguntar si desea sobrescribir** los datos actuales.
    *   Si el usuario responde "s" (sí), los datos anteriores se reemplazan.
    *   Si responde "n" (no), el registro se cancela.
-   Cada nota debe validarse para que esté entre **0 y 100**.
-   Si se ingresa una nota inválida, debe pedirse nuevamente.
-   Los datos deben almacenarse en variables estáticas para ser utilizados por otros métodos.

------------------------------------------------------------------------

### 3. Mostrar la Información del Estudiante Actual

-   Imprime en consola el nombre y las tres notas registradas.

-   Si aún no se ha registrado ningún estudiante, muestra un mensaje
    informativo:

        No hay datos de estudiante registrados actualmente.

------------------------------------------------------------------------

### 4. Calcular Promedio del Estudiante Actual

-   Calcula el promedio de las tres notas del estudiante actual.
-   Si no hay datos registrados, debe mostrar un mensaje de advertencia.
-   Debe **retornar el promedio** como `double`.
-   El método que lo llama debe imprimirlo con dos decimales, usando
    `System.out.printf()`.

------------------------------------------------------------------------

### 5. Mostrar Resumen Completo del Estudiante

-   Muestra todos los datos registrados en formato claro:

        --- Resumen del Estudiante ---
        Nombre: Julian Villanueva
        Nota 1: 85.00
        Nota 2: 75.50
        Nota 3: 90.00
        Promedio: 83.50
        Estado: Aprobado

-   El estado del estudiante se determina con base en su promedio:

    -   **Aprobado**: promedio ≥ 60
    -   **Reprobado**: promedio \< 60

------------------------------------------------------------------------

### 6. Limpiar los Datos del Estudiante Actual

-   Restablece el sistema al estado inicial:

    -   `Nombre = "N/A"`
    -   `Notas = -1`

-   Muestra el mensaje:

        Los datos del estudiante actual han sido borrados exitosamente.

------------------------------------------------------------------------

### 7. Validar Nota

-   Recibe una nota como parámetro y verifica si está en el rango **\[0,
    100\]**.
-   Retorna `true` si es válida, `false` en caso contrario.

------------------------------------------------------------------------

### 8. Validar Nombre

-   Recibe un nombre como parámetro y verifica que no esté vacío ni contenga solo espacios.
-   Retorna `true` si es válido, `false` en caso contrario.

------------------------------------------------------------------------

### 9. Lógica del `main`

El método `main`: - Crea el objeto `Scanner`. - Muestra el menú dentro
de un bucle `while`. - Lee la opción del usuario y llama al método
correspondiente. - Controla la opción **0 (Salir)** para terminar el
programa. - Cierra el objeto `Scanner` antes de finalizar.

------------------------------------------------------------------------

## Recomendaciones

-   Comienza implementando las funciones básicas (mostrar menú,
    registrar estudiante, mostrar datos)
-   Usa `System.out.printf()` para mostrar promedios y notas con dos
    decimales.
-   Incluye comentarios descriptivos antes de cada método.
-   Evita repetir código utilizando funciones auxiliares para
    validaciones.

