package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import java.sql.*;

public class EjemploMetainformacion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            // Enlazar con el driver
            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement stm = con.createStatement();

            String query = "SHOW DATABASES";
            //ResultSet resultados = stmt.executeQuery();

            stm.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Ha fallado la conexión: " + e.getMessage());
        }
    }
}
