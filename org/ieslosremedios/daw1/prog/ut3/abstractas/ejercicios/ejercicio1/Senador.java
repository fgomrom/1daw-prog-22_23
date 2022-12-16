package org.ieslosremedios.daw1.prog.ut3.abstractas.ejercicios.ejercicio1;

public class Senador extends Legislador {
    private int asientoCamaraAlta;
   
    public Senador () {
        super ();
        asientoCamaraAlta = 0;
    }

    public Senador (String nombre, String apellido, int edad, boolean casado, String provinciaQueRepresenta, String partidoPolitico, int numeroDespacho, int asientoCamaraAlta) {
        super (nombre, apellido, edad, casado, provinciaQueRepresenta, partidoPolitico, numeroDespacho);
        this.asientoCamaraAlta = asientoCamaraAlta;
    }

    @Override
    public String getCamaraEnQueTrabaja () {
        return "Senadores";
    }

    public void setAsientoCamaraAlta (int asientoCamaraAlta) {
        this.asientoCamaraAlta = asientoCamaraAlta;
    }

    public int getAsientoCamaraAlta () {
        return asientoCamaraAlta;
    }
}
