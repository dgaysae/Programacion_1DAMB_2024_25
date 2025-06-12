package unidad07.apdo3_2;

/**
 *
 * @author diego
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    @Override
    public String toString() {
        return String.format("Persona{dni: %s, nombre: %s, apellidos: %s}",
                dni, nombre, apellidos);
    }
}
