# Proyecto del Módulo 1: Sistema Básico de Gestión de Productos

Este proyecto te permitirá consolidar todos los conocimientos del Módulo 1, aplicando funciones, estructuras condicionales, bucles, validaciones y variables estáticas para gestionar información de productos en una tienda.  

---

## Objetivo del Proyecto

Desarrollar un programa en consola que simule un **sistema básico de registro y consulta de información de un producto**, utilizando **métodos**, **estructuras condicionales**, **bucles**, **validaciones** y **variables estáticas**.  
El programa debe ser modular, fácil de leer, mantener y probar.

---

## Requisitos Generales

- El programa debe estar contenido en **una sola clase Java**.  
- El método `main` solo debe encargarse de **mostrar el menú y controlar el flujo principal del programa**.  
- Cada funcionalidad debe estar implementada en un **método independiente**.  
- Los datos del producto deben almacenarse en **variables estáticas** accesibles desde cualquier método.  

---

## Funcionalidades a Implementar (como Métodos)

### 1. Mostrar Menú Principal

Debe mostrar el siguiente menú de opciones:

```text
--- Sistema de Gestión de Productos ---

1. Registrar nuevo producto
2. Mostrar información del producto actual
3. Calcular valor total del inventario
4. Mostrar resumen completo del producto
5. Limpiar datos del producto actual
0. Salir
Ingrese su opción:
```

---

### 2. Registrar la Información de un Producto

- Solicita al usuario los siguientes datos:
  - **Nombre del producto**
  - **Precio unitario**
  - **Cantidad en inventario**
- Antes de registrar, si ya hay un producto guardado, el sistema debe **preguntar si desea sobrescribir** los datos.
  - Si el usuario responde `"s"`, se reemplazan los datos.
  - Si responde `"n"`, se cancela el registro.
- El precio y la cantidad deben validarse:
  - El precio debe ser **mayor que 0**.
  - La cantidad debe ser **un número entero no negativo**.
- Los datos válidos deben almacenarse en variables estáticas para ser usados en los demás métodos.

---

### 3. Mostrar Información del Producto Actual

- Imprime en consola los datos registrados: nombre, precio y cantidad.
- Si no hay datos guardados, muestra:
  
  ```
  No hay datos de producto registrados actualmente.
  ```

---

### 4. Calcular Valor Total del Inventario

- Calcula el valor total del inventario:  
  `valorTotal = precioUnitario * cantidad`
- Si no hay datos registrados, muestra un mensaje de advertencia.
- Retorna el valor total como `double` y lo muestra con dos decimales usando `System.out.printf()`.

---

### 5. Mostrar Resumen Completo del Producto

Muestra todos los datos en un formato legible:

```
--- Resumen del Producto ---
Nombre: Laptop Lenovo
Precio Unitario: $2,500,000.00
Cantidad en Inventario: 5
Valor Total en Inventario: $12,500,000.00
Estado del Stock: Stock suficiente
```

- El **estado del stock** se determina así:
  - **Stock bajo**: cantidad < 5  
  - **Stock suficiente**: cantidad entre 5 y 20  
  - **Stock alto**: cantidad > 20  

---

### 6. Limpiar Datos del Producto Actual

- Restablece las variables al estado inicial:
  - `nombre = "N/A"`
  - `precio = 0.0`
  - `cantidad = 0`
- Muestra:
  
  ```
  Los datos del producto actual han sido borrados exitosamente.
  ```

---

### 7. Validar Precio

- Recibe un número como parámetro y verifica que sea mayor que 0.  
- Retorna `true` si es válido, `false` en caso contrario.

---

### 8. Validar Cantidad

- Recibe la cantidad como parámetro y verifica que sea mayor o igual a 0.  
- Retorna `true` si es válida, `false` en caso contrario.

---

### 9. Validar Nombre del Producto

- Verifica que el nombre no esté vacío ni contenga solo espacios.  
- Retorna `true` si es válido, `false` si no.

---

### 10. Lógica del `main`

El método `main` debe:  
- Crear el objeto `Scanner`.  
- Mostrar el menú dentro de un bucle `while`.  
- Leer la opción del usuario y llamar al método correspondiente.  
- Controlar la opción **0 (Salir)** para terminar el programa.  
- Cerrar el objeto `Scanner` antes de finalizar.  
