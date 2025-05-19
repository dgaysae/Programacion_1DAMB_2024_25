package unidad09.model.dao.mysql;

import unidad09.model.Alumno;
import unidad09.model.dao.AlumnosDao;

import java.util.ArrayList;

public class AlumnosDaoMySql implements AlumnosDao {

    public ArrayList<Alumno> select(){
        ArrayList<Alumno> alumnos = new ArrayList<>();

        return alumnos;
    }

    public Alumno select(String dni) {
        Alumno alumno = new Alumno("a", "d", "d", "d", null);

        return alumno;
    }

    public void insert(Alumno a) {

    }

    public void insert(Alumno... a) {
        for (Alumno alumno : a) {
            insert(alumno);
        }
    }

    public void update(Alumno a) {

    }

    public void delete(Alumno a) {

    }
}
