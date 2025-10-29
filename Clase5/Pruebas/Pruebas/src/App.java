import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       // EjemploIf();
       // EjemploIf_Else();
       //Switch();
      // ExpresionSwitch();
      //ExpresionSwitch_Yield();
      //CicloWhile();
      Do_While();
    }

    public static void EjemploIf() {
       
        int numero = 10;

        if (numero > 0) {
            
            System.out.println("El número es positivo.");
        }
       
        System.out.println("Fin del programa.");
 
    }

    public static void EjemploIf_Else() {
        int numero = 7;

        if (numero % 2 == 0) { // Si el residuo de la división por 2 es 0, es par
            System.out.println("El número es par.");
        } else { // Si la condición del if es false...
            System.out.println("El número es impar.");
        }

        System.out.println("Fin del programa.");
    }

    public static void Ejemplo_if_anidado() {
        int calificacion = 85;

        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) { // Se evalúa SOLO si la primera condición (calificacion >= 90) fue false
            System.out.println("Muy Bien");
        } else if (calificacion >= 70) { // Se evalúa SOLO si las condiciones anteriores fueron false
            System.out.println("Bien");
        } else { // Se ejecuta si ninguna de las condiciones anteriores fue true
            System.out.println("Necesita mejorar");
        }
    }

    public static void Switch() {
        int diaSemana = 6; // 1=Lunes, 2=Martes, etc.
        String nombreDia;

        switch (diaSemana) { // La variable a evaluar
            case 1: // Si diaSemana es 1...
                nombreDia = "Lunes";
                break; // Importante: sale del switch después de ejecutar el código del case
            case 2: // Si diaSemana es 2...
                nombreDia = "Martes";
                break;
            case 3: // Si diaSemana es 3...
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6: // Múltiples casos pueden compartir el mismo bloque de código
            case 7:
                nombreDia = "Fin de semana";
                break;
            default: // Opcional: se ejecuta si el valor de diaSemana no coincide con ningún 'case'
                nombreDia = "Día inválido";
                break; // Es buena práctica poner break incluso en el default
        }
        
        System.out.println("El día es: " + nombreDia); // Salida: El día es: Miércoles
    }

    public static void ExpresionSwitch() {
        int diaSemana = 10; // 1=Lunes, 2=Martes, etc.

        // Usando switch expression para asignar un valor a una variable
        String nombreDiaModerno = switch (diaSemana) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6, 7 -> "Fin de semana"; // Múltiples casos separados por coma
            default -> "Día inválido";
        }; // Nota el punto y coma al final de la expresión switch

        System.out.println("El día (moderno) es: " + nombreDiaModerno); // Salida: El día (moderno) es: Miércoles
    }


    public static void ExpresionSwitch_Yield(){
        // También puedes usar bloques con 'yield' si necesitas más de una línea de código en un case
        int mes = 2;
        int diasEnMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                // Lógica más compleja si es necesario
                System.out.println("Considerando Febrero...");
                yield 28; // 'yield' devuelve el valor para este case ( -> cuando hay mas de una línea)
            }
            default -> {
                System.out.println("Mes inválido.");
                yield -1; // Devuelve -1 para un mes inválido
            }
        };
        System.out.println("Días en el mes " + mes + ": " + diasEnMes);
    }

    public static void CicloWhile() {
            int contador = 0; 

            while (contador < 5) { 
                System.out.println("Iteración: " + contador);
                contador++; 
            }
            boolean error = true;

            while(error){
                System.out.println("Hubo un error, intentando de nuevo...");
                // Simulamos que el error se resuelve en la segunda iteración
                error = false;
            }
          
    }

    public static void Do_While() {
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0); // La condición se evalúa después de la primera ejecución y en cada iteración subsiguiente

        System.out.println("Número ingresado: " + numero);
        scanner.close();
        // Este bucle siempre pedirá un número al menos una vez. Si el primer número es positivo, la condición es false y el bucle termina. Si no, seguirá pidiendo hasta que se ingrese uno positivo.
    }

    public static void For() {
        // Sintaxis: for (inicialización; condición; actualización) { // código }

            for (int i = 5; i <= 10 && i >= 5; i++) { // i empieza en 1; el bucle continúa mientras i <= 10; i se incrementa en 1 después de cada iteración
                System.out.println("Contando: " + i);
            }
            // Salida:
            // Contando: 1
            // Contando: 2
            // ...
            // Contando: 10
    }
}
