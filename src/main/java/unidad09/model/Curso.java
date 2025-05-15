package unidad09.model;

public class Curso {
    private Integer id;
    private String nombre;
    private String abreviatura;
    private String descripcion;

    public Curso(Integer id, String nombre, String abreviatura, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.descripcion = descripcion;
    }

    public Curso(String nombre, String abreviatura, String descripcion) {
        this(null, nombre, abreviatura, descripcion);
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
