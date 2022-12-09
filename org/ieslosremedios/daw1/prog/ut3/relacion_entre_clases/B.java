package org.ieslosremedios.daw1.prog.ut3.relacion_entre_clases;

public class B extends A {
    String c1;
    String c3 = "verde";

    void imprimeC1 () {
        System.out.println(this.c1);
        System.out.println(super.c1);
        System.out.println(c1);
    }

    B (String c1) {
        this.c1 = c1;
    }

    @Override
    void metodo (int a) {

    }

}
