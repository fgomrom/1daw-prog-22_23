package ut2;

enum Dia {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO,
    DESCONOCIDO
}

public class EjemploSwitch {
    public static void main(String[] args) {

        Dia diaDeHoy = Dia.DESCONOCIDO;

        switch (diaDeHoy) {
            case LUNES:
                System.out.println("Lunes");
                break;
            case MARTES:
                System.out.println("Martes");
                break;
            case MIERCOLES:
                System.out.println("Miércoles");
                break;
            case JUEVES:
                System.out.println("Jueves");
                break;
            case VIERNES:
                System.out.println("Viernes");
                break;
            case SABADO: case DOMINGO:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Valor desconocido");
                break;
        }
    }
}
