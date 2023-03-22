package org.ieslosremedios.daw1.prog.ut6.algoritmia.voraz;

import java.util.Arrays;

public class ProblemaMochilaFaccionaria extends EsquemaVoraz{

    private int n;
    private Integer max;
    private Integer pesoActual;

    private Integer[] pesos;
    private Integer[] valores;

    public ProblemaMochilaFaccionaria(int n, Integer max, Integer[] pesos, Integer[] valores) {
        this.n = n;
        this.max = max;
        this.pesos = pesos;
        this.valores = valores;
    }

    /**
     *
     */
    @Override
    protected void anotaEnSolucion() {

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
    protected void seleccionaYEliminaCandidato() {
        int i = 1;
        Integer mayor = valores[i]/pesos[i];
        for (i = 0; i < n; i++) {
            if (mayor < valores[i]/pesos[i]) {
                mayor = valores[i]/pesos[i];
            }
        }
        candidato = mayor;
        etapa = i;
        // Elimina candidato
        valores[etapa] = 0;
    }

    /**
     * @return
     */
    @Override
    protected boolean fin() {
        return max == pesoActual;
    }

    /**
     *
     */
    @Override
    protected void inicializa() {
        solucion = new Object[n];
        Arrays.fill(solucion,0);
        pesoActual = 0;
    }
}
