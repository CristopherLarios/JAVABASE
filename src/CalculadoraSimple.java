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

        //Division
        if (b==0) {
            System.out.println("Error: No se puede dividir entre entre cero");
        } else {
            double resultado = a/b;
            System.out.println("Resultado: " + resultado);
        }




        // Multiplicación        
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();

        
    }
}
