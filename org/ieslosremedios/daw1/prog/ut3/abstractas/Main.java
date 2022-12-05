package org.ieslosremedios.daw1.prog.ut3.abstractas;

import org.ieslosremedios.daw1.prog.ut3.ClaseAbstracta;
import org.ieslosremedios.daw1.prog.ut3.ClaseNoAbtractaHija;

public class Main {
    public static void main(String[] args) {
        ClaseAbstracta c = new ClaseNoAbtractaHija();
        c.metodoAbstracto();
        c.metodoNoAbstracto();
    }
}
