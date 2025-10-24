import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //ejemploScanner();
       //ejemploConversion();
       //ejemploRelacionales();
       EjercicioIMC();
    }

    public static void ejemploConversion() {
       //ejemplo 1
        int cantidad  = 5;
        int total = 4;
        double promedio = (double) total / cantidad; // División entera
        System.out.println("Promedio entero: " + promedio);


        //Situación 1 Conversión implícita:  pequeño --> grande
        int numeroEntero = 10;
        double numeroDouble = numeroEntero; // Conversión implícita
        System.out.println("Número double (implícito): " + numeroDouble);

        //Situación 2 Conversión implícita con operaciones
        byte a = 5;
        byte b = 10;
        int suma = a + b; // 'a' y 'b' se convierten implícitamente a int
        System.out.println("Suma (implícito): " + suma);


        //Situación 3 Conversión explícita: grande --> pequeño
        double valorDouble = 9.78;
        int valorEntero = (int) valorDouble; // Conversión explícita
        System.out.println("Valor entero (explícito): " + valorEntero);

        //Ejemplo chat:
        int a2 = 2;
        int b2 = 16;
        double c1 = (double) a2 / b2; // 0.125
        double c2 = (double) (a2 / b2); // 0.0
        System.out.println(c1 + " : " + c2);
    }

    public static void ejemploScanner() {

         var sc = new Scanner(System.in); //fuente de escucha desde la consola
        

        //Ejemplo leyendo distintos tipos de datos
        System.out.print("Ingrese su edad: ");
        int edadUsuario = sc.nextInt(); // Lee un entero

        System.out.print("Ingrese su salario: ");
        double salarioUsuario = sc.nextDouble(); // Lee un double

        // ¡Importante! Limpiar el buffer después de nextInt/nextDouble
        // porque nextLine() solo lee el salto de línea restante.
        sc.nextLine(); // Consume el salto de línea pendiente

        System.out.print("Ingrese su nombre completo: ");
        String nombreUsuario = sc.nextLine(); // Lee una línea completa de texto

        System.out.println("Hola " + nombreUsuario + ", tienes " + edadUsuario + " años y ganas " + salarioUsuario);

        sc.close(); // Es buena práctica cerrar el Scanner cuando ya no lo necesites
    }

    public static void  ejemploRelacionales(){
        int a = 10;
        int b = 5;
    

        System.out.println(a > b);  // true
        System.out.println(a < b);  // false    
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        boolean resultado = a != b;
        System.out.println("El resultado de a != b es: " + resultado);


    }

    public static void EjercicioIMC(){
        var sc = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);

        System.out.println("-----Resultados-----\n");
        System.out.println("Su índice de masa corporal (IMC) es: " + imc);
        System.out.println("IMC menor que 18.5: Bajo peso: " + (imc < 18.5));
        System.out.println("IMC entre 18.5 y 24.9: Peso normal: " + (imc >= 18.5 && imc <= 24.9));
        System.out.println("IMC entre 25 y 29.9: Sobrepeso: " + (imc >= 25));
    }

}
