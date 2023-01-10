package org.ieslosremedios.daw1.prog.ut3.interfaces;

public class Consola implements Imprimible {

    private String pantalla = PROMPT; // Al ser un campo y no una variable, puedo usarlo antes de declararlo.
    private final static String PROMPT = "$";

    /**
     * Sobreescribe el contenido con asteriscos
     */
    @Override
    public void borrar() {
        int longitud = pantalla.length();
        pantalla = "";
        for (int i = 0; i < longitud; i++) {
            pantalla += "*";
        }
    }

    /**
     * Imprime el contenido de pantalla con formato en mayúsculas
     */
    @Override
    public void imprime() {
        System.out.printf("%S%n", pantalla);
    }

    public void establecerContenido (String contenido) {
        pantalla = PROMPT + contenido;
    }
}
