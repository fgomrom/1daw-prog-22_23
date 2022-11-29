package ut3.relacion_entre_clases;

public class Estudiante extends Persona{
    private Integer carnet;
    private Float notaMedia;

    public Estudiante() {
    }

    public Estudiante(Integer carnet) {
        this.carnet = carnet;
    }

    public Estudiante(String nombre, Integer carnet) {
        super(nombre);
        this.carnet = carnet;
    }

    public Boolean esMatriculaHonor () {
        return notaMedia > 9;
    }

    public Integer getCarnet() {
        return carnet;
    }

    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }

    public Float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Float notaMedia) {
        this.notaMedia = notaMedia;
    }
}
