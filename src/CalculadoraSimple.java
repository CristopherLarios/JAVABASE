import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();
                           
        //operacion suma
            int suma = a + b;
            System.out.println("Suma: " + suma);
        //operacion resta
            int resta = a - b;  
            System.out.println("Resta: " + resta);
        //operacion division (abihail)
            if (b == 0) {
            int division = a / b;
            System.out.println("Division: " + division);
            } else {
            System.out.println("Error: No se puede dividir entre 0.");
            }
        // Multiplicación (eliezer)
            int multiplicacion = a * b;
            System.out.println("Multiplicación: " + multiplicacion);
    
        scanner.close();  
        System.out.println("Gracias por usar la calculadora simple.");         
      

    }
}