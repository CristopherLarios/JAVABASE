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

        //Multiplicacion 
        int mult = a * b; 
        System.out.println("Multiplicacion: " + mult);

        scanner.close();


        if (b !=0){
        //Division
        double division = a / b;
        System.out.println("Division: " + division);
        } else {
            System.out.println("Operacion no valida");
        }
    }
}
