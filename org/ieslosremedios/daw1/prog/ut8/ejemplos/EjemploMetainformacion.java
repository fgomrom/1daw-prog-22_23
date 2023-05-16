package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import java.sql.*;

public class EjemploMetainformacion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            Connection con = DriverManager.getConnection(url, "root", "2107");
            Statement stm = con.createStatement();

            // Alternativa con Statement
            /*String query = "SHOW DATABASES";
            ResultSet resultados = stm.executeQuery(query);
            System.out.println("Bases de datos existentes:");
            while (resultados.next()) {
                // Obtiene la columna por su índice, ya que no conocemos el nombre.
                System.out.println("- " + resultados.getString(1));
            }*/

            // Alternativa con DataaseMetaData
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet resultados = metaData.getCatalogs();
            System.out.println("Bases de datos existentes:");
            while (resultados.next()) {
                System.out.println("- " + resultados.getString("TABLE_CAT"));
            }
            System.out.println("Usuario: " + metaData.getUserName());

            stm.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Ha fallado la conexión: " + e.getMessage());
        }
    }
}
