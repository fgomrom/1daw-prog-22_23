package org.ieslosremedios.daw1.prog.ut3.abstractas.ejercicios.ejercicio1;

public class Diputado extends Legislador {
    private int asientoCamaraBaja;

    public Diputado () {
        super ();
        asientoCamaraBaja = 0;
    }

    public Diputado (String nombre, String apellido, int edad, boolean casado, String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho, int asientoCamaraBaja) {
        super (nombre, apellido, edad, casado, provinciaQueRepresenta, partidoPolitico, numeroDespacho);
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    @Override
    public String getCamaraEnQueTrabaja () {
        return "Diputados";
    }

    public void setAsientoCamaraBaja (int asientoCamaraBaja) {
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    public int getAsientoCamaraBaja () {
        return asientoCamaraBaja;
    }
}
