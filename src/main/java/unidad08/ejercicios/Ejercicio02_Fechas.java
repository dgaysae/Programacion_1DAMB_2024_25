package unidad08.ejercicios;

/**
 *
 * @author diego
 */
public class Ejercicio02_Fechas {
    public static void main(String[] args) {
        
        try {
            
            MiFecha miFecha = new MiFecha(-12, 10, 0);
        }
        catch (FechaIncorrectaException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
        
    }
}
