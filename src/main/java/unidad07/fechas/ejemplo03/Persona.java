package unidad07.fechas.ejemplo03;

import java.time.LocalDate;

public class Persona {
    private final String nombre;
    private final LocalDate fechaNacimiento;
    private String cargo;

    public Persona(String nombre, LocalDate fechaNacimiento, String cargo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", cargo=" + cargo + '}';
    }
    
    
}
