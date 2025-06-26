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
        int multiplicacion = a * b;

        System.out.println("Multiplicación: " + multiplicacion); 

        // División
        if (b != 0) {
            float division = (float) a / b;
            System.out.println("el resultado de tu division es: " + division);
        } else {
            System.out.println("division por 0, no es valida");
        }
        scanner.close();

    }
}
