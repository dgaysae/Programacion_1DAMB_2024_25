
import unidad04.herencia.Vehiculo;
import unidad04.herencia.Coche;
import unidad04.herencia.Moto;


/**
 * 
 * @author diego
 */
public class Main {
    
    public static void main(String[] args) {
        Moto moto1 = new Moto("Honda", "A");
        Vehiculo coche1 = new Coche("Peugeot", "309", 4);
        
        moto1.recorrer(10);
        
    }
    
}
