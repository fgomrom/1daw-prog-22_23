package org.ieslosremedios.daw1.prog.ut3.relacion_entre_clases;

public class Direccion {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String pais;

    Boolean validar () {
        return calle != null && !calle.isEmpty();
    }

    void imprimir () {
        System.out.println("Dirección: " + calle + ", " + ciudad);
    }

    public Direccion ()  {

    }

    public Direccion(String calle, String ciudad, String provincia, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
