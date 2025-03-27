package unidad08.ejemplos.Object_Input_Output_Stream.ejemplo01;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private float altura;
    private boolean esPersonajeReal;

    public Persona(String nombre, String apellido, int edad, float altura, boolean esPersonajeReal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.esPersonajeReal = esPersonajeReal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public boolean isEsPersonajeReal() {
        return esPersonajeReal;
    }
    
    public void mostrar() {
        System.out.println("Persona{"
                + "nombre=" + nombre
                + ", apellido=" + apellido
                + ", edad=" + edad
                + ", altura=" + altura
                + ", esPersonajeReal=" + esPersonajeReal + '}');
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + ", esPersonajeReal=" + esPersonajeReal + '}';
    }

    
}
