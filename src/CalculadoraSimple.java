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

        //mutiplicación
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);

     
        //division
        if (b != 0) {
    int division = a / b;
    System.out.println("Division: " + division);
} else {
    System.out.println("Error: No se puede dividir entre 0.");
}
    scanner.close();
        
    }
}
