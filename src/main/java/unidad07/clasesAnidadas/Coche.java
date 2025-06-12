package unidad07.clasesAnidadas;

/**
 *
 * @author diego
 */
public class Coche {
    private int velocidad;
    private Motor motor;
    
    class Motor {
        int cilindros;
        
        Motor(int cilindros) {
            velocidad = 0;
            this.cilindros = cilindros;
        }
    }

    public Coche(int cilindrada) {
        motor = new Motor(cilindrada);
    }
    
    
    
}
