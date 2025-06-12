package unidad09;

import unidad09.model.Curso;
import unidad09.model.dao.mysql.CursosDaoMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainDao {
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql://localhost/instituto";

    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD)) {
            CursosDaoMySql cursosDao = new CursosDaoMySql(conexion);

            ArrayList<Curso> cursos = cursosDao.select();
            for(Curso curso: cursos)
                System.out.println(curso);

            Curso cursoId = cursosDao.select(2);
            System.out.println(cursoId);

            CursosDaoMySql m = new CursosDaoMySql(conexion);
        }
        catch (SQLException e) {

        }
    }
}
