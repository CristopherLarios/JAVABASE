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

        // Multiplicación
        int multiplicacion  = a*b;
        System.out.println(" La Multiplicación es de: " + multiplicacion);
        
        // Division
        int division = a / b;
        if (b == 0 ) {
            System.out.println("La division no puede ser entre 0");
        }
        System.out.println("Division: " + division);


        scanner.close();

        
    }
}
