public class App {
    public static void main(String[] args) throws Exception {
        
        //numeros enteros
        byte numeroPequeño = 100;
        short numeroMediano = 10000; //inicialización (valor por primera vez)
        int numeroGrande; //declaración

        var numeroMuyGrande = 100000; //inicialización con var (Java infiere el tipo de dato)
        var n1 = 34;
        long numeroEnorme = 100_000L; //se recomienda usar L mayúscula para literales long
        long numeroEnorme2 = 100_000_000_000L;


        var numeroFlotante = 3.144354853533f; //float
        System.out.println(numeroFlotante);

        var numeroDouble = 3.14159265358979323846d; //double
        System.out.println(numeroDouble);

        //boolean
        boolean verdadero = true;
        boolean falso = false;
        boolean esMayor = n1 > 18 && n1 < 65;

        //char
        char caracter = 'A';
        char caracterEspecial = '\u0040'; //código unicode
        System.out.println(caracterEspecial);

        char tabulacion = '\t';
        char espacio = ' ';
        System.out.println(tabulacion);

        //String: unicode
        String nombre = "Juan Pérez";

        System.out.println(nombre);
        //string con caracteres no imprimibles
        String nombreConSaltos = "Juanes123\rPérez";
        System.out.println(nombreConSaltos);
        //tabulacion
        String nombreConTabulacion = "Juanes123\tPérez";
        String otroNombreContabulacion= "Alfonso456\tGómez";
        String nombreConTabulacion2 = "María78\tLópez";
        System.out.println(nombreConTabulacion);
        System.out.println(otroNombreContabulacion);
        System.out.println(nombreConTabulacion2);


        //Operadores +, -, *, /, %
        int a = 10;
        double b = 3.0;
        var resultadoDivision = a / b; //división entera
        System.out.println("Resultado división: " + resultadoDivision);

        var resultado = 10 * (3 + 45) / 5;
                       // 30   + 9 = 39
        System.out.println("Resultado operación: " + resultado);

        int c = 8;
        int resultado2 = 10 + c--; //pre-incremento
        System.out.println("Resultado2: " + resultado2);
        System.out.println("Valor de c después del post-incremento: " + c);

        int d = 8;
        //d = d + 12;
        d += 12; // 20
        d *= 2; // d = d * 2; // 40
        d -= 10; // d = d - 10; // 30
        d /= 3; // d = d / 3; // 10
        System.out.println("Valor de d después de la suma: " + d);

    }
}
