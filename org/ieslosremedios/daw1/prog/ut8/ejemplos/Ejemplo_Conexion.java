package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import java.sql.*;

public class Ejemplo_Conexion {
    public static void main(String[] args) {
        try {
            // Establecer conexión
            Class.forName("org.mariadb.jdbc.Driver"); // No necesario a partir de Java 6
            String url = "jdbc:mariadb://localhost:3306/tienda";
            Connection con = DriverManager.getConnection(url, "fran", "Fr4n");
            Statement stmt = con.createStatement();

            //Operaciones CRUD
            listarProductosEspanoles(stmt);

            // Operaciones de actualización
            String queryInsert = "INSERT INTO tienda.producto (id, nombre, descripcion, precio, pais) " +
                    "VALUES ('1', 'fresa', 'fresa portuguesa', 3, 'Portugal');";
            System.out.println("Se insertaron: " + stmt.executeUpdate(queryInsert)+ "filas");
            listarProductosEspanoles(stmt);

            String queryUpdate = "UPDATE tienda.producto SET precio = 6 WHERE id = '1';";
            System.out.println("Se actualizaron: " + stmt.executeUpdate(queryUpdate)+ "filas");
            listarProductosEspanoles(stmt);

            String queryDelete = "DELETE FROM tienda.producto WHERE id = '1';";
            System.out.println("Se eliminaron: " + stmt.executeUpdate(queryDelete)+ "filas");
            listarProductosEspanoles(stmt);

            // Cerrar conexión
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontró el driver: " + e.getMessage());
        }
    }

    private static void listarProductosEspanoles(Statement stmt) throws SQLException {
        String query = "SELECT * FROM producto;";
        ResultSet resultados = stmt.executeQuery(query);
        System.out.println("Listado de todos los productos españoles: ");

        while (resultados.next()) {
            System.out.println("Producto " + resultados.getString("nombre"));
        }
    }
}
