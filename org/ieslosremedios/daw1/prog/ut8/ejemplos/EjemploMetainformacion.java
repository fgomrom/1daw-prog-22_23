package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import java.sql.*;

public class EjemploMetainformacion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stm = con.createStatement();

            boolean hayResultSet = stm.execute("SELECT nombre FROM producto WHERE LOWER(pais) like 'espana'");
            ResultSet r = stm.executeQuery("SELECT nombre FROM producto WHERE LOWER(pais) like 'espana'");

            if (hayResultSet) {
                ResultSet rs = stm.getResultSet();
                while (rs.next()) {
                    System.out.println("- " + rs.getString("nombre"));
                }
            } else {
                System.out.println("No existen productos de España.");
            }

            // Alternativa con Statement
            /*String query = "SHOW DATABASES";
            ResultSet resultados = stm.executeQuery(query);
            System.out.println("Bases de datos existentes:");
            while (resultados.next()) {
                // Obtiene la columna por su índice, ya que no conocemos el nombre.
                System.out.println("- " + resultados.getString(1));
            }*/

            // Alternativa con DataaseMetaData
            /*DatabaseMetaData metaData = con.getMetaData();
            ResultSet resultados = metaData.getCatalogs();
            System.out.println("Bases de datos existentes:");
            while (resultados.next()) {
                System.out.println("- " + resultados.getString("TABLE_CAT"));
            }
            System.out.println("Usuario: " + metaData.getUserName());*/

            // Tablas de la base de datos tienda
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet resultados = metaData.getTables(null, "tienda", null, null);
            System.out.println("Tablas existentes en tienda");
            resultados = metaData.getTables("tienda", null, null, null);
            while (resultados.next()) {
                System.out.println("- " + resultados.getString("TABLE_NAME"));
            }

            // Tablas de la base de datos tienda
            resultados = metaData.getColumns("tienda", null, "producto", null);
            while (resultados.next()) {
                System.out.println("- " + resultados.getString("COLUMN_NAME"));
            }

            stm.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Ha fallado la conexión: " + e.getMessage());
        }
    }
}
