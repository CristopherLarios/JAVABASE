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

<<<<<<< HEAD
       

        //Multiplicacion
        int mult = a * b;
        System.out.println("Multiplicacion: " + mult);

         scanner.close();
=======
        // Estudiante a -abi multiplicacion-feature
        int multiplicacion = a * b;
        System.out.println("la multiplicacion: "+ multiplicacion);

        scanner.close();
>>>>>>> 133f495781a7631bfa06e34c20a0a630bcdb47fc
    }
}
