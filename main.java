public static double dividir(int a, int b) {
    if (b == 0) {
        System.out.println("Error: No se puede dividir entre 0");
        return 0;
    }
    return (double) a / b;
}
