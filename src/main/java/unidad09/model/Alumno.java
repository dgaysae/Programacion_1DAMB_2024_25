package unidad09.model;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private Integer cursoId;

    public Alumno(String dni, String nombre, String apellidos, String email, Integer cursoId) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.cursoId = cursoId;
    }

    public Alumno(String dni, String nombre, String apellidos, String email) {
        this(dni, nombre, apellidos, email, null);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public int getCursoId() {
        return cursoId;
    }
}
