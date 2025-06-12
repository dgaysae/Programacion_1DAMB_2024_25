package unidad09.model.dao.mysql;

import unidad09.model.Curso;
import unidad09.model.dao.CursosDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursosDaoMySql implements CursosDao {
    private static final String GETALL = "SELECT id, nombre, abreviatura, descripcion FROM cursos";
    private static final String GETONE = "SELECT id, nombre, abreviatura, descripcion FROM cursos WHERE id = ?";
    private static final String INSERT = "INSERT INTO cursos (nombre, abreviatura, descripcion) VALUES (?, ?, ?)";
    private static final String DELETE = "DELETE FROM cursos WHERE id = ?";
    private static final String UPDATE = "UPDATE cursos SET nombre = ?, abreviatura = ?, descripcion = ? WHERE id = ?";

    Connection c;

    public CursosDaoMySql(Connection c) {
        this.c = c;
    }

    @Override
    public ArrayList<Curso> select() {
        ArrayList<Curso> cursos = new ArrayList<>();

        try (PreparedStatement sentencia = c.prepareStatement(GETALL);
             ResultSet filas = sentencia.executeQuery();) {
            while (filas.next()) {
                cursos.add(new Curso(
                        filas.getInt(1),
                        filas.getString(2),
                        filas.getString(3),
                        filas.getString(4)
                ));
            }

        } catch (SQLException e) {
            System.out.println("ERROR! No se ha ejecutado la query: " + e.getMessage());
        }

        return cursos;
    }



    @Override
    public Curso select(Integer id) {
        return null;
    }

    @Override
    public void insert(Curso a) {

    }

    @Override
    public void insert(Curso... a) {

    }

    @Override
    public void update(Curso a) {

    }

    @Override
    public void delete(Curso a) {

    }
}
