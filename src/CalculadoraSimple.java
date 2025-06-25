import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Elija la operación: 1) Suma  2) Resta  3) Multiplicación");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            int suma = a + b;
            System.out.println("Suma: " + suma);
        } else if (opcion == 2) {
            int resta = a - b;
            System.out.println("Resta: " + resta);
        } else if (opcion == 3) {
            int multiplicacion = a * b;
            System.out.println("Multiplicación: " + multiplicacion);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}