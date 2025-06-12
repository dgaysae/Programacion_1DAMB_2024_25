package unidad08.ejemplos.csv;

public class Persona {
    private static int id = 0;
    private String nombre;
    private String apellidos;
    private String dni;
    private double altura;

    public Persona(String nombre,
                   String apellidos,
                   String dni,
                   double altura
    ) {
        id++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public double getAltura() {
        return altura;
    }

    public String toCSV() {
        final char SEPARADOR = ',';
        return this.id + SEPARADOR
                + this.nombre + SEPARADOR
                + this.apellidos + SEPARADOR
                + this.dni + SEPARADOR
                + this.altura;
    }

}
