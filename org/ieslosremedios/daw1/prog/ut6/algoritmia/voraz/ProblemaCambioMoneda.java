package org.ieslosremedios.daw1.prog.ut6.algoritmia.voraz;

public class ProblemaCambioMoneda extends EsquemaVoraz {

    // Inputs
    int[] monedas;
    int cambio;

    Integer candidato;

    public ProblemaCambioMoneda(int[] monedas, int cambio) {
        this.monedas = monedas;
        this.cambio = cambio;
    }

    /**
     *
     */
    @Override
    protected void inicializa() {
        solucion = new Integer[monedas.length];
        candidato = 0;
        etapa = 0;
    }

    /**
     * @return
     */
    @Override
    protected boolean fin() {
        return etapa == monedas.length;
    }

    /**
     *
     */
    @Override
    protected void seleccionaYEliminaCandidato() {
        candidato = cambio / monedas[etapa];
    }

    /**
     * @return
     */
    @Override
    protected boolean esPrometedor() {
        return true;
    }

    /**
     *
     */
    @Override
    protected void anotaEnSolucion() {
        solucion[etapa] = candidato;
        cambio = cambio - monedas[etapa] * (Integer)candidato;
        etapa++;
    }

}
