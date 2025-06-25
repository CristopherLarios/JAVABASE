import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        int resultado = a * b;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
