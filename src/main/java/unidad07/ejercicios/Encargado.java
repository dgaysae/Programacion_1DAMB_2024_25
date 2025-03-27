
package unidad07.ejercicios;

/**
 *
 * @author lucas
 */
public class Encargado extends Empleado{
    public static final double PORCENTAJE = 1.1;
    
    public Encargado(String nombre, double sueldo){
        super(nombre, sueldo);
    }
    
    @Override
    public double getSueldo(){
        return super.getSueldo() * PORCENTAJE;
    }
    
}
