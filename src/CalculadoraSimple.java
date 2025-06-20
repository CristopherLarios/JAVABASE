import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);

        //División
        double div = a / b;
        if (b == 0) {
            System.out.println("No es posible dividir entre 0 .");
        } else {
            System.out.println("División: "+ div);
        }

       //Multiplicación
       int multiplicacion = a * b;
        System.out.println ("Multiplicación: " + multiplicacion);

        scanner.close();

        
    }
}
