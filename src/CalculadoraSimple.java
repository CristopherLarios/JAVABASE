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
    
    // Multiplicacion
    int multiplicacion = a * b;
    System.out.println("Multiplicacion: " + multiplicacion);

    // Division    
    // Si a es igual a 0 entonces volver a solicitar a, si b es igual a 0
    // entonces solicitar b.
     if (a == 0) {
        System.out.println("No Puede Realizar una division por CERO");
        System.out.println("Ingrese el primer numero nuevamente: ");
        a = scanner.nextInt();

     }
     if (b == 0) {
        System.out.println("No Puede Realizar una division por CERO");
        System.out.println("Ingrese el segundo numero nuevamente: ");
        b = scanner.nextInt();

     }

     // Realizamos la conversion de los valores de Entero a Double para evitar
     // que la JVM trunque el resultado de la division
     double division = Double.valueOf(a) / Double.valueOf(b);
     System.out.printf(" Division: %.2f ", division);

    scanner.close();
  }

}
