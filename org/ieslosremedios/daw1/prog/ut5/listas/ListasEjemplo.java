package org.ieslosremedios.daw1.prog.ut5.listas;

import java.util.ArrayList;
import java.util.List;

public class ListasEjemplo {
    public static void main(String[] args) {
        ArrayList<String> vocales = new ArrayList<>();
        vocales.add("E");
        vocales.add("A");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
        System.out.println(vocales);

        System.out.println(vocales.get(2));

        System.out.println(vocales.remove(0));
        System.out.println(vocales);
        System.out.println(vocales.remove("O"));
        System.out.println(vocales);
        System.out.println(vocales.remove(new Integer(1)));
        System.out.println(vocales);
        System.out.println(vocales.set(1,"Z"));
        System.out.println(vocales);
    }
}
