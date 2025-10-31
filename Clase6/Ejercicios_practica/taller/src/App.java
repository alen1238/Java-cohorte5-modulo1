import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //CicloFor();
        //CicloForBreak();
       // CicloForContinue();
       //Ternario();
       Taller();
    }

    public static void CicloFor() {
                // Ejemplo de for con decremento
        for (int j = 15; (j > 0) && (j <= 10); j--) { // j empieza en 5; se repite mientras j > 0; j se decrementa en 1
            System.out.println("Cuenta regresiva: " + j);
        }
        // Salida: Cuenta regresiva: 5 ... Cuenta regresiva: 1
    }

     public static void CicloForBreak() {
        int limite = 6;
        for (int i = 1; i <= 10; i++) {
                if (i == limite) {
                    System.out.printf("Encontrado el número %d. Saliendo del bucle.%n", limite);
                    break; // Sale del bucle for
                }
                System.out.println("Procesando: " + i);
            }
            System.out.println("Después del bucle.");
        
    }

    public static void CicloForContinue(){
           
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Si i es impar...
                System.out.println("Saltando número impar: " + i);
                continue; // Salta el resto del código en esta iteración (el println de abajo)
            }
        // Este código solo se ejecuta si i es par
        System.out.println("Procesando número par: " + i);
        }
    }
    
    public static void Ternario() {
        int numero = 7;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es " + resultado);
    }

    public static void Taller(){
        var sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n\n--- Analizador de Números y Secuencias ---\n");
            System.out.println("1. Analizar un solo número.");
            System.out.println("2. Generar secuencia de números.");
            System.out.println("0. Salir.");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Analizar un solo número seleccionado.");
                    System.out.print("Ingrese un número entero:");
                    int numero = sc.nextInt();
                    String r1 = (numero < 0) ? "Negativo" : "Positivo";
                    System.out.printf("El número %d es %s%n", numero, r1);
                    String r2 = (numero % 2 == 0) ? "Par" : "Impar";
                    System.out.printf("El número %d es %s%n", numero, r2);
                    String r3 = (numero >= 100) ? "Mayor o igual" : "Menor";
                    System.out.printf("El número %d es %s que 100%n", numero, r3);
                    break;
                case 2:
                    System.out.println("Generar secuencia de números seleccionado.");
                    System.out.print("Ingrese el número inicial: ");
                    int inicio = sc.nextInt();
                    System.out.print("Ingrese el número final: ");
                    int fin = sc.nextInt();
                    System.out.print("¿Mostrar solo 'par' o 'impar'?: (p/i): ");
                    sc.nextLine(); // Limpiar el buffer
                    String tipo = sc.nextLine();
                    for(int i = inicio; i <= fin; i++){
                            if(i % 2 == 0 && tipo.equals("p")){
                                System.out.print(i + " ");
                            }else if(i % 2 != 0 && tipo.equals("i")){
                                //continue;
                                 System.out.print(i + " ");
                            }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }

        }while(opcion != 0);
        
       sc. close();
    }
    
}
