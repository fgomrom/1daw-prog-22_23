package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Ejemplo_NativeQuery {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // No soportado en ObjectDB por no ser una BD relacional: https://www.objectdb.com/forum/514
        List<Coche> coches = em.createNativeQuery("Select * from cochecito;", Coche.class).getResultList();
        for (Coche coche :
                coches) {
            System.out.println(coche.getColor());
        }



    }
}
