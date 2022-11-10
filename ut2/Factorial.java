package ut2;

public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}
