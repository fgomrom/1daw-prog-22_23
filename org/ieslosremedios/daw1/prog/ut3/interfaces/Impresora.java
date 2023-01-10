package org.ieslosremedios.daw1.prog.ut3.interfaces;

public class Impresora implements Imprimible {
    /**
     * Contenido que se imprimirá
     */
    private String pagina;
    public Impresora() {
        // Se inicializa el contenido de la página con el texto por defecto
        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

    /**
     * Realiza una impresión del contenido dado por pagina sin ningún tipo de formato
     */
    // Con la anotación Override indicamos que tenemos intención de sobreescribir un método de la interfaz
    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    /**
     * Establece el contenido de la página
     * @param contenido el contenido de la página
     */
    @Override
    public void establecerContenido(String contenido) {
        pagina = contenido;
    }

    /**
     * Borra el contenido de la página
     */
    @Override
    public void borrar() {
        pagina = "";
    }
}
