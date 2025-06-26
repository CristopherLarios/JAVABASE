import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número (a): ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número (b): ");
        int b = sc.nextInt();

        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("No se puede dividir entre 0");
        }

        sc.close();
    }
}