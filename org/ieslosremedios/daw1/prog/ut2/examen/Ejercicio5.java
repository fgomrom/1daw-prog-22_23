package ut2.examen;

public class Ejercicio5 {

    public static final int ALTURA = 4;

    public static void main(String[] args) {
        // Copa
        int k = 0;
        for (int i = 0; i < ALTURA; i++) {
            for (int j = 0; j < ALTURA - i; j++)
                System.out.print(" ");
            for (k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        // Tronco
        int mitad = Math.round(k / 2f);
        int mitadInicio = mitad - 1;
        int mitadFin = k - mitad + 1;
        if (ALTURA == 2) {
            mitadInicio++;
            mitadFin = mitadInicio;
        }
        for (int i = 1; i <= ALTURA - 1; i++) {
            System.out.print(" ");
            int j = 1;
            for (j = 1; j < k; j++) {
                if (j == mitadInicio || j == mitadFin) {
                    System.out.print("|");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
