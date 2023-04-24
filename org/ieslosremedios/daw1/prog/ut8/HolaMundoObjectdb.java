package org.ieslosremedios.daw1.prog.ut8;

import javax.persistence.*;
import java.sql.Date;

@Entity(name="Hola")
public class HolaMundoObjectdb {

    private Date fecha1;

    @Temporal(TemporalType.DATE)
    private java.util.Date fecha2;

    enum TipoFruta {PERA, MANZANA}

    @Enumerated(EnumType.ORDINAL)
    private TipoFruta tipoFruta;

}
