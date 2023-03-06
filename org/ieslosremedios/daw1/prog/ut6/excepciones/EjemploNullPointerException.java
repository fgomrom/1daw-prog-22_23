package org.ieslosremedios.daw1.prog.ut6.excepciones;

public class EjemploNullPointerException {
    public static void main(String[] args) {
        ejemplo();
    }

    private static void ejemplo() {
        String s = null;
        s.equals("null");
    }
}
