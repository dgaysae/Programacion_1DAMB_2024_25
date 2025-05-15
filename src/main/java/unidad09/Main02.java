package unidad09;

import java.sql.Types;

import java.sql.*;

public class Main02 {
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql://localhost/instituto";

    public static void main(String[] args) {
        String dniInsertar = "77777771G";
        String nombreInsertar = "Pepa";
        String apellidosInsertar = "López López";
        String emailInsertar = "pepa@lopez.es";
        String cursoIdInsertar = "";

        Connection conexion = null;
        PreparedStatement sentencia = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);

//            Statement sentencia = conexion.createStatement();
//            ResultSet filas = sentencia.executeQuery("SELECT dni, nombre, apellidos FROM alumnos WHERE dni = \"" + dniBuscar + "\"");
            sentencia = conexion.prepareStatement("INSERT into alumnos (dni, nombre, apellidos, email, curso_id) VALUES (?, ?, ?, ?, ?)");
            sentencia.setString(1, dniInsertar);
            sentencia.setString(2, nombreInsertar);
            sentencia.setString(3, apellidosInsertar);
            sentencia.setString(4, emailInsertar);
            sentencia.setNull(5, Types.INTEGER);

            int filasAfectadas = sentencia.executeUpdate();

        } catch (SQLException e) {
            System.out.println("ERROR de conexión: " + e.getMessage());
        } finally {
            cerrar(conexion, sentencia);
        }
    }

    public static void cerrar(Connection conexion, PreparedStatement sentencia, ResultSet filas) {
        try {
            if (sentencia != null) sentencia.close();
            if (conexion != null) conexion.close();
        } catch (SQLException e) {}
    }

    public static void cerrar(Connection conexion, PreparedStatement sentencia) {
        cerrar(conexion, sentencia, null);
    }
}
