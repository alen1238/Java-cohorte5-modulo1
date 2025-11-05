public class App {
    public static void main(String[] args) throws Exception {
        
        // System.out.println("Se guarda la información de Liliana en el sistema.");
        // System.out.println("Se guarda la información de Carlos en el sistema.");
        // System.out.println("Se guarda la información de Ana en el sistema.");
        // System.out.println("Se guarda la información de Marta en el sistema.");
        // System.out.println("Se guarda la información de Juan en el sistema.");
       //guardarInformacion("Liliana", "Gomez");
        // String saludoAlmacenado = obtenerSaludo();
        // System.out.println(saludoAlmacenado);
        // int miNumero = 10;
        // System.out.println("Antes de llamar al método: " + miNumero); // Salida: 10

        // modificarNumero(miNumero); // Pasamos una copia de miNumero (el valor 10)

        // System.out.println("Después de llamar al método: " + miNumero); // Salida: 10 (la variable original no cambió)
        ejemploAlcance();
        System.out.println("Valor de miVariable2 en el main: " + miVariable2);
    }

     public static void modificarNumero(int miNumero) {
        System.out.println("Dentro del método - Antes de modificar: " + miNumero); // Muestra la copia
        miNumero = miNumero * 2; // Modifica la copia local
        System.out.println("Dentro del método - Después de modificar: " + miNumero); // Muestra la copia modificada
    }


    public static void guardarInformacion(String nombre, String apellido) {
        // Lógica para guardar la información de la persona en el sistema
        System.out.println("Se guarda la información de " + nombre + " " + apellido + " en el sistema.");
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static String obtenerSaludo() {
        return "Hola, !";
    }

    public static void ejemploAlcance(){
        String miVariable2 = "Otra variable cualquiera";
        String nombre = "Carlos";

        for( int i = 0; i < 5; i++){
            System.out.println("Valor de i dentro del bucle: " + i);
            System.out.println("Hola, " + nombre);
        }

        miVariable2 = "Nuevo valor";
        System.out.println("Valor de miVariable2 dentro del método: " + miVariable2);
    }

    static String miVariable2 = "Variable cualquiera";
}
