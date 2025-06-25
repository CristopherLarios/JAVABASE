// Desarrollado por Estudiante B (Helio Rivera)

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = input.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("⚠️ No se puede dividir entre cero.");
        }

        input.close();
    }
}