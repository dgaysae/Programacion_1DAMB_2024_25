
package unidad07.ejercicios;

/**
 *
 * @author lucas
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
}
