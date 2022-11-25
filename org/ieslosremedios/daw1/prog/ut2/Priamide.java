package org.ieslosremedios.daw1.prog.ut2;

public class Priamide {
    private static final int NIVELES = 4;

    public static void main(String[] args) {
        for (int i = 1; i <= NIVELES; i++) {
            for (int j = 1; j <= NIVELES+i-1; j++) {
                if (j <= NIVELES-i || j >= NIVELES+i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
