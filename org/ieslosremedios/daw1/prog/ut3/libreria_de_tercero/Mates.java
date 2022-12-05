package org.ieslosremedios.daw1.prog.ut3.libreria_de_tercero;

public class Mates {
    static Integer factorial (Integer n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
