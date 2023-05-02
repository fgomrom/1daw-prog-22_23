package org.ieslosremedios.daw1.prog.ut8;

import javax.persistence.*;
import java.io.Serializable;

/**
 * POJO Coche
 */
@Entity (name = "cochecito")
public class Coche implements Serializable {
    @Embedded
    private Fabricante fabricante;


    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "referenciaSeq")
    @SequenceGenerator(initialValue = 50, allocationSize = 10, name = "referenciaSeq")
    private Integer referencia;
    private String color;

    private String marca;


    public Coche() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
