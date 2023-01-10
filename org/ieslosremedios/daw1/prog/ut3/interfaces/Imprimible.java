package org.ieslosremedios.daw1.prog.ut3.interfaces;

public interface Imprimible extends Borrable, Editable {
    String TEXTO_POR_DEFECTO = "Página de prueba"; // es public final static por defecto no hace falta ponerlo
    void imprime(); // es public abstract por defecto no hace falta ponerlo

}
