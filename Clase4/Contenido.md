# Operadores Relacionales en Java

## Introducción

Los operadores relacionales se utilizan para **comparar valores** en
Java. El resultado de una comparación siempre es un valor **booleano**,
es decir, `true` (verdadero) o `false` (falso). Estos operadores son
fundamentales para evaluar condiciones y establecer decisiones lógicas
en los programas.

Antes de introducir estructuras condicionales como `if` o `switch`, es
importante comprender cómo funcionan los operadores relacionales, ya que
son la base de toda comparación en Java.

------------------------------------------------------------------------

## Tipos de operadores relacionales

  Operador   Significado         Ejemplo      Resultado
  ---------- ------------------- ------------ -----------
  `>`        Mayor que           `5 > 3`      `true`
  `<`        Menor que           `2 < 1`      `false`
  `>=`       Mayor o igual que   `7 >= 7`     `true`
  `<=`       Menor o igual que   `4 <= 5`     `true`
  `==`       Igual que           `10 == 10`   `true`
  `!=`       Diferente de        `9 != 8`     `true`

------------------------------------------------------------------------

## Características principales

1.  **El resultado siempre es booleano:**
    -   Las comparaciones devuelven `true` o `false`, nunca un número.
2.  **Compatibilidad de tipos:**
    -   Los operadores relacionales se pueden usar con tipos numéricos
        (`int`, `float`, `double`, etc.), caracteres (`char`), y
        booleanos (solo `==` y `!=`).
3.  **Comparación de caracteres:**
    -   En Java, los caracteres se comparan por su código ASCII. Por
        ejemplo, `'A' < 'B'` es `true` porque el código de `'A'` es 65 y
        el de `'B'` es 66.
4.  **Comparación de cadenas:**
    -   Para comparar el **contenido** de dos cadenas se usa el método
        `.equals()`.
    -   El operador `==` solo compara si dos variables apuntan al
        **mismo objeto** en memoria.

    ``` java
    String a = "Hola";
    String b = "Hola";
    String c = new String("Hola");

    System.out.println(a == b);      // true (mismo objeto del pool)
    System.out.println(a == c);      // false (diferente objeto)
    System.out.println(a.equals(c)); // true (mismo contenido)
    ```

------------------------------------------------------------------------

## Ejemplos básicos

### Ejemplo 1: Comparación de enteros

``` java
int x = 10;
int y = 20;
System.out.println(x > y);   // false
System.out.println(x < y);   // true
System.out.println(x == y);  // false
```

### Ejemplo 2: Comparación de caracteres

``` java
char letra1 = 'A';
char letra2 = 'C';
System.out.println(letra1 < letra2); // true
```

### Ejemplo 3: Comparación con booleanos

``` java
boolean activo = true;
boolean conectado = false;
System.out.println(activo == conectado); // false
System.out.println(activo != conectado); // true
```

------------------------------------------------------------------------

## Importancia didáctica

Los operadores relacionales son esenciales para comprender cómo un
programa evalúa expresiones y determina el flujo de ejecución. Antes de
introducir estructuras condicionales, los estudiantes deben dominar
estos operadores, pues constituyen la base de las decisiones lógicas.

------------------------------------------------------------------------

# Ejercicio Práctico: Calculando el IMC 

## Enunciado

**Ejercicio: Calculando y analizando el Índice de Masa Corporal (IMC)**

En este ejercicio, el estudiante debe:

1.  Pedir al usuario su **peso (en kilogramos)** y su **altura (en
    metros)**.\
2.  Calcular su **IMC** usando la fórmula: \[ IMC =
    `\frac{peso}{altura^2}`{=tex} \]
3.  Mostrar en consola:
    -   El valor del IMC calculado.
    -   Si ese IMC es **menor que 18.5**, **mayor o igual a 18.5**,
        **menor que 25**, **menor que 30**, etc., **sin usar estructuras
        condicionales (`if`, `else`) lo veremos después**.
4.  Para ello, el estudiante debe usar **operadores relacionales** (`<`,
    `>`, `<=`, `>=`, `==`, `!=`) y concatenar sus resultados (`true` o
    `false`) en mensajes de texto que permitan interpretar el resultado.

El propósito es comprender cómo los operadores relacionales devuelven
valores booleanos y cómo estos se pueden imprimir directamente para
analizar las comparaciones.


