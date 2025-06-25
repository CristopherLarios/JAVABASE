import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

        //multiplicacion
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);

        //division
        if (b!=0){
            double division = a/b;
            System.out.println("Division: " + division);
        }
        else{
            System.out.println("No se puede dividir por 0");
        }


        scanner.close();

        
    }
}
