package unidad04.herencia;

/**
 *
 * @author diego
 */
public class Moto extends Vehiculo {
    private static final double LITROS_POR_KM = 0.02;
    private static final double CAPACIDAD_MINIMA = 10;
    private double capacidadDeposito;

    public Moto(String marca,
            String modelo,
            String color,
            int numeroRuedas,
            double combustible,
            double capacidadDeposito) {
        
        super(marca, modelo, color, numeroRuedas, combustible);
        this.capacidadDeposito = capacidadDeposito;
    }
    
    public Moto(String marca,
            String modelo) {
        
        this(marca, modelo, "Blanco", 2, 0, CAPACIDAD_MINIMA);
        
    }
    
    public void printMarca() {
        System.out.println("Marca: " + getMarca());
    }
    
    public void recorrer(int kmRecorridos) {
        if (kmRecorridos > 0) {
            double combustibleConsumido = LITROS_POR_KM * kmRecorridos;
            consumirCombustible(combustibleConsumido);
        }
    }
}
