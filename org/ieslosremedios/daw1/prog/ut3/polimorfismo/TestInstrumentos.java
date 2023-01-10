package org.ieslosremedios.daw1.prog.ut3.polimorfismo;

public class TestInstrumentos {
    public static void main(String[] args) {
        Instrumentos i = new Guitarra();
        i = new Tambor();
        i.sonidoQueEmite();
    }
}

class Instrumentos {
    public void sonidoQueEmite() {
        System.out.println("tilin, tilin...");
    }
}

class Guitarra extends Instrumentos {
    public void sonidoQueEmite() {
        System.out.println("sonido de guitarra");
    }
}


class Tambor extends Instrumentos {
    public void sonidoQueEmite() {
        System.out.println("sonido de tambor");
    }
}