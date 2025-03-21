package unidad08.ejemplos.objetos;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Coche implements Serializable {
    private String marca;
    private String modelo;
    private int kmRecorridos;
    
    public Coche(String marca, String modelo, int kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = kmRecorridos;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String toString() {
        return "Coche {marca: " + marca
                + ", modelo: " + modelo
                + ", kmRecorridos: " + kmRecorridos
                + "}";
    }
}
