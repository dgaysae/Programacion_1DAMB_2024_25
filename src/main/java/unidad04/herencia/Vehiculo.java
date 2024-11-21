package unidad04.herencia;

/**
 * 
 * @author diego
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    private String color;
    private int numeroRuedas;
    
    /**
     * Nº de litros en el depósito.
     */
    private double combustible;
    private long kmRecorridos;
    
    public Vehiculo(String marca,
            String modelo,
            String color,
            int numeroRuedas,
            double combustible) {
        
        this.kmRecorridos = 0;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroRuedas = numeroRuedas;
        this.combustible = combustible;
    }
    
    public Vehiculo(String marca,
            String modelo,
            int numeroRuedas) {
        
        this(marca, modelo, "Blanco", numeroRuedas, 0);
        
    }
    
    public String getMarca() {
        return marca;
    }
    
    public double getCombustible() {
        return combustible;
    }
    
    public long getKmRecorridos() {
        return kmRecorridos;
    }
    
    public void setCombustible(double litros){
        if (litros > 0 ) {
            combustible += litros;
        }
    }
    
    public void setKmRecorridos(long km){
        if (km > 0 ) {
            kmRecorridos += km;
        }
    }
    
    protected void consumirCombustible(double litrosConsumidos) {
        if (litrosConsumidos > 0
                && (combustible - litrosConsumidos > 0)){
            combustible -= litrosConsumidos;
        }
        
        if (combustible < 0) {
            combustible = 0;
        }
    }
}
