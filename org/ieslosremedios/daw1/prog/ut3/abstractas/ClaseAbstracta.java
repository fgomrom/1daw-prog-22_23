package org.ieslosremedios.daw1.prog.ut3.abstractas;

public abstract class ClaseAbstracta {
    public abstract void metodoAbstracto();
    public void metodoNoAbstracto() {
        System.out.println("Soy un método no abstracto definido en una clase abstracta");
    }
}
