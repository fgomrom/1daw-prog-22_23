package org.ieslosremedios.daw1.prog.ut8.ejercicios;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class EventoMusical implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "miSecuencia")
    @SequenceGenerator(initialValue = 10, allocationSize = 10, name = "miSecuencia")
    private Integer id;
    private String nombre;
    @Transient
    private Date fecha;
    private BigDecimal recaudacion;

    @Enumerated(EnumType.STRING)
    private GeneroMusical generoMusical;

    @Embedded
    private List<Artista> artistas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }
}
