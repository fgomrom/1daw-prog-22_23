package org.ieslosremedios.daw1.prog.ut8.ejemplos;

import java.sql.*;

public class Ejemplo_Batch {
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

            String queryUpdate = "UPDATE tienda.producto SET precio = 6 WHERE id = '1';";

            String queryDelete = "DELETE FROM tienda.producto WHERE id = '1';";

            // Ejecutar todas las queries en un lote en una única transacción

            // Desactivar auto-commit
            con.setAutoCommit(false);
            // Añadir queries al lote
            stmt.addBatch(queryInsert);
            stmt.addBatch(queryUpdate);
            stmt.addBatch(queryDelete);
            // Recuperar número de registros afectados
            int[] numRegistrosAfectados = stmt.executeBatch();
            // Confirmar cambios
            con.commit();

            // Vacier el lote para ejecutar otro en el futuro
            stmt.clearBatch();

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
