package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploConexionJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            // Enlazar con el driver
            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement stm = con.createStatement();
            //TODO consultas

            stm.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Ha fallado la conexión: " + e.getMessage());
        }
    }
}
