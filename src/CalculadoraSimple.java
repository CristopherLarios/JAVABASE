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

        //Multiplicación
        int multi = a * b;
        System.out.println("Multiplicación: " + multi);



        // division
        if (b !=0){
            double division = (double)a/b;
        System.out.println("division:"+division);   
         }else{
            System.out.println("error: division por cero no permitida.");
         }

        scanner.close();

        
    }
}
