package org.ieslosremedios.daw1.prog.ut3.interfaces;

import static org.ieslosremedios.daw1.prog.ut3.interfaces.Imprimible.pagina;

public class TestImpresora {
    public static void main(String[] args) {
        Imprimible impresora1 = new Impresora();
        impresora1.imprime();
        System.out.println(pagina);

    }
}
