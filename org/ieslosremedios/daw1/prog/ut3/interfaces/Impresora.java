package org.ieslosremedios.daw1.prog.ut3.interfaces;

public class Impresora implements Imprimible {
    String pagina;
    public Impresora() {
        pagina = Imprimible.pagina;
    }

    @Override
    public void imprime() {
        System.out.println(pagina);
    }
}
