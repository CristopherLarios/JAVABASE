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

        //multiplicacion
        int multiplicacion = a * b;
        System.out.println("Multiplicacion: " + multiplicacion);

               //division
        if (b!=0){
            int divicion = a/b; 
         System.out.println("la divicion entre "+a+" / "+b+" = "+divicion); 
        } else {
           System.out.println(" no se puede dividir entre 0 ");
        }

        Scanner close;



        
    }
}
