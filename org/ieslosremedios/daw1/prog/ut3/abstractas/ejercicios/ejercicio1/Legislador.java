package org.ieslosremedios.daw1.prog.ut3.abstractas.ejercicios.ejercicio1;

public abstract class Legislador extends Persona{
    String provinciaQueRepresenta;
    String partidoPolitico;
    int numeroDespacho;

    public Legislador () {
        super ();
        provinciaQueRepresenta = "";
        partidoPolitico = "";
        numeroDespacho = 0;
    }

    public Legislador (String nombre, String apellido, int edad, boolean casado, String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho) {
        super (nombre, apellido, edad, casado);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numeroDespacho = numeroDespacho;
    }

    abstract public String getCamaraEnQueTrabaja();

    public void setProvinciaQueRepresenta (String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public void setPartidoPolitico (String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public void setNumeroDespacho (int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public String getProvinciaQueRepresenta () {
        return provinciaQueRepresenta;
    }

    public String getPartidoPolitico () {
        return partidoPolitico;
    }

    public int getNumeroDespacho () {
        return numeroDespacho;
    }

}
