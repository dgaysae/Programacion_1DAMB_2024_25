package unidad04.examen;

/**
 *
 * @author diego
 */
public abstract class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null) {
            nombre = "Anonimo";
        }

        this.nombre = nombre;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad < 0) {
            edad = 0;
        }

        this.edad = edad;

    }

    /**
     * Comprueba que en una cadena de valores delimitados se encuentra el valor
     * introducido como nuevo.
     * 
     * @param valoresValidos Cadena de valores delimitados.
     * @param nuevo El valor a comprobar.
     * @return true si nuevo está en valoresValidos.
     */
    public static boolean valorValido(String valoresValidos, String nuevo) {
        return valoresValidos.contains("#" + nuevo.toLowerCase() + "#");
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + nombre + ", Edad: " + edad + "}";
    }
}
