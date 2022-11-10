enum Mes {
    ENERO,
    FEBRERO,
    MARZO,
    ABRIL,
    MAYO,
    JUNIO,
    JULIO,
    AGOSTO,
    SEPTIEMBRE,
    OCTUBRE,
    NOVIEMBRE,
    DICIEMBRE
}

public class EjemploEnumerados {
    
    public static void main(String[] args) {
        
        Mes mes = Mes.OCTUBRE;
        int numeroDias = 30;

        switch (mes) {
            case ENERO:case MARZO:case MAYO:case JULIO:case AGOSTO:case OCTUBRE:case DICIEMBRE:
                numeroDias = 31;
                break;
            case FEBRERO:
                numeroDias = 28;
                break;
        }

        System.out.println("El número de días de " + mes + " es: " + numeroDias);
    }
}
