public class Calculadora {
    public static void main(String[] args) {
        Bienvenida();
        double resultadoSuma = sumar(100, 50);
        double resultadoResta = restar(100, 50);
        imprimirResultado("Resta", resultadoResta);
        imprimirResultado("Suma", resultadoSuma);
    }

    public static void Bienvenida() {
        System.out.println("****Bienvenido a la Calculadora****");
        System.out.println("***********************************");
    }

    public static void imprimirResultado(String descripcion , double resultado){
        System.out.println("El resultado de " + descripcion + " es: " + resultado);
    }

    public static double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2){
        return numero1 - numero2;
    }



}
