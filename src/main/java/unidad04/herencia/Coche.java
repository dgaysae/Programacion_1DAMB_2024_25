package unidad04.herencia;

/**
 * 
 * @author diego
 */
public class Coche extends Vehiculo {
    
    public Coche(String marca, String modelo, String color, int numeroRuedas, double combustible) {
        super(marca, modelo, color, numeroRuedas, combustible);
    }

    public Coche(String marca, String modelo, int numeroRuedas) {
        super(marca, modelo, numeroRuedas);
    }
}
