package org.ieslosremedios.daw1.prog.ut2;

public class EjemploEscalera {
    private static final int N = 5;

    public static void main(String[] args) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
