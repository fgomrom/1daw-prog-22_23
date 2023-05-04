package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Ejemplo3_Create {
    public static void main(String[] args) {
        // Abrir conexión
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // Iniciar la transacción
        em.getTransaction().begin();

        // Operaciones
        Coche c3 = new Coche();
        c3.setColor("Azul");

        Coche c4 = new Coche();
        c4.setColor("Amarillo");
        c4.setMarca("Renault");

        em.persist(c3);

        // No funciona con JPQL
        /*Query queryInsertaCoche = em.createNativeQuery("INSERT INTO c4 (color, marca) values (?, ?)");
        queryInsertaCoche.setParameter(1, c4.getColor());
        queryInsertaCoche.setParameter(2, c4.getMarca());
        int numeroObjetosInsertados = queryInsertaCoche.executeUpdate();*/

        // Finalizar la transacción: salvar la información
        em.getTransaction().commit();

        // Cerrar conexión
        em.close();
        emf.close();

    }
}
