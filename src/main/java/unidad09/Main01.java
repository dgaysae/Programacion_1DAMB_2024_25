package unidad09;

import java.sql.*;

public class Main01 {
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql://localhost/instituto";

    public static void main(String[] args) {
        String dniBuscar = "44444444D";
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet filas = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("estamos dentro");

//            Statement sentencia = conexion.createStatement();
//            ResultSet filas = sentencia.executeQuery("SELECT dni, nombre, apellidos FROM alumnos WHERE dni = \"" + dniBuscar + "\"");
//            sentencia = conexion.prepareStatement("SELECT dni, nombre, apellidos, email, curso_id FROM alumnos WHERE dni = ?");
//            sentencia.setString(1, dniBuscar);
            sentencia = conexion.prepareStatement("SELECT dni, nombre, apellidos, email, curso_id FROM alumnos");

            filas = sentencia.executeQuery();
            while(filas.next()) {
                String dni = filas.getString("dni");
                String nombre = filas.getString("nombre");
                String apellidos = filas.getString(3);
                String email = filas.getString(4);
                String cursoId = filas.getString(5);

                System.out.printf("%s - %s, %s; %s; %s %n",
                        dni,
                        apellidos,
                        nombre,
                        email,
                        cursoId);
            }

        } catch (SQLException e) {
            System.out.println("ERROR de conexión: " + e.getMessage());
        } finally {
            cerrar(conexion, sentencia, filas);
        }
    }

    public static void cerrar(Connection conexion, PreparedStatement sentencia, ResultSet filas) {
        try {
            if (filas != null) filas.close();
            if (sentencia != null) sentencia.close();
            if (conexion != null) conexion.close();
        } catch (SQLException e) {}
    }
}
