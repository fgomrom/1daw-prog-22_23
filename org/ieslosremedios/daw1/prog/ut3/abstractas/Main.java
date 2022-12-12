package org.ieslosremedios.daw1.prog.ut3.abstractas;

public class Main {
    public static void main(String[] args) {
        ClaseAbstracta c = new ClaseNoAbtractaHija();
        c.metodoAbstracto();
        c.metodoNoAbstracto();
    }
}
