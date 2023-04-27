package org.ieslosremedios.daw1.prog.ut8;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EventoMusical implements Serializable {
    private String nombre;
    private Date fecha;
    private BigDecimal recaudacion;

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
