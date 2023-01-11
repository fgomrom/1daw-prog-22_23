package org.ieslosremedios.daw1.prog.ut3.interfaces;

public class TestImpresiones {
    public static void main(String[] args) {
        Imprimible epsonStylus = new Impresora();
        epsonStylus.imprime();
        epsonStylus.borrar();
        epsonStylus.imprime();
        epsonStylus.establecerContenido("Esto es un test");
        epsonStylus.imprime();

        Imprimible linuxBash = new Consola();
        linuxBash.imprime();
        linuxBash.borrar();
        linuxBash.imprime();
        linuxBash.establecerContenido("Esto es un test");
        linuxBash.imprime();

        // Otro test
        linuxBash.borrar();
        linuxBash.imprime();
    }
}
