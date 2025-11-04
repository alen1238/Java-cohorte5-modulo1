
# Casos Especiales de Alcance en Java

## Caso 1: Conflicto entre variable global y local

```java
public class AlcanceEjemplo1 {
    static int contador = 10;

    public static void main(String[] args) {
        int contador = 5;
        System.out.println("Variable local en main: " + contador);
        mostrarContador();
    }

    static void mostrarContador() {
        System.out.println("Variable global desde otra función: " + contador);
    }
}
```

**Explicación:**  
En `main`, la variable local oculta a la global. En `mostrarContador()`, solo existe la global. El alcance depende del bloque donde fue declarada.

---

## Caso 2: Parámetros que ocultan variables globales

```java
public class AlcanceEjemplo2 {
    static int descuento = 10;

    public static void main(String[] args) {
        aplicarDescuento(50);
        aplicarDescuento(100);
    }

    static void aplicarDescuento(int descuento) {
        System.out.println("Descuento dentro del método: " + descuento + "%");
    }
}
```

**Explicación:**  
El parámetro del método tiene el mismo nombre que la variable global, lo que la oculta dentro del método. Si se desea acceder a la global, se puede usar `AlcanceEjemplo2.descuento`.

---

## Caso 3: Cambios locales que no afectan la variable global

```java
public class AlcanceEjemplo3 {
    static int total = 100;

    public static void main(String[] args) {
        System.out.println("Antes del método: " + total);
        incrementar(total);
        System.out.println("Después del método: " + total);
    }

    static void incrementar(int total) {
        total = total + 50;
        System.out.println("Dentro del método: " + total);
    }
}
```

**Explicación:**  
Los tipos primitivos se pasan por valor. Esto significa que se pasa una copia del dato, y los cambios no afectan la variable global.

---

## Caso 4: Modificar la variable global dentro de un método

```java
public class AlcanceEjemplo4 {
    static int total = 100;

    public static void main(String[] args) {
        System.out.println("Antes del cambio: " + total);
        modificarGlobal();
        System.out.println("Después del cambio: " + total);
    }

    static void modificarGlobal() {
        total += 50;
        System.out.println("Dentro del método: " + total);
    }
}
```

**Explicación:**  
La variable global puede modificarse directamente desde otro método si no existe una variable local con el mismo nombre. Esto puede ser útil, pero también riesgoso si no se controla adecuadamente.

---

## Caso 5: Global, local y parámetro con el mismo nombre

```java
public class AlcanceEjemplo5 {
    static int puntos = 100;

    public static void main(String[] args) {
        int puntos = 50;
        System.out.println("Local (main): " + puntos);
        aumentarPuntos(puntos);
        System.out.println("Después del método, local sigue igual: " + puntos);
        System.out.println("Global después del método: " + AlcanceEjemplo5.puntos);
    }

    static void aumentarPuntos(int puntos) {
        System.out.println("Parámetro recibido: " + puntos);
        puntos += 20;
        System.out.println("Parámetro modificado (no global): " + puntos);
        AlcanceEjemplo5.puntos += 10;
        System.out.println("Global modificada dentro del método: " + AlcanceEjemplo5.puntos);
    }
}
```

**Explicación:**  
En este ejemplo existen tres niveles de variables con el mismo nombre: global, local y parámetro. El método modifica solo su copia local, pero puede acceder y modificar la global usando el nombre de la clase.

---

## Caso 6: Global compartida entre varios métodos

```java
public class AlcanceEjemplo6 {
    static int contador = 0;

    public static void main(String[] args) {
        registrar();
        registrar();
        mostrarTotal();
    }

    static void registrar() {
        contador++;
        System.out.println("Se registró un estudiante. Total actual: " + contador);
    }

    static void mostrarTotal() {
        System.out.println("Total final de registros: " + contador);
    }
}
```

**Explicación:**  
La variable global es compartida por todos los métodos. Cada vez que se llama a `registrar()`, su valor se incrementa. Esto demuestra que las variables globales pueden servir como contadores o acumuladores, aunque deben manejarse con cuidado.
