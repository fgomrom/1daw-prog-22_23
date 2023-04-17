package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.Serializable;

public class ObjetoSerializable implements Serializable {

    private static final long serialVersionUID = -4797208967054263305L;

    int atributo1;
    static int atributo2;
    transient int atributo3;

    public ObjetoSerializable(int atributo1, int atributo2, int atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public ObjetoSerializable() {
        this.atributo1 = 7;
        this.atributo2 = 7;
        this.atributo3 = 7;
    }
}
