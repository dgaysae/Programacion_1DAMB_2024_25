package unidad05.equals.ejemplo02;

/**
 * Ejemplo extraído de: https://www.baeldung.com/java-equals-hashcode-contracts
 *
 * @author diego
 */
public class ValeIncorrecto extends Dinero {

    private String tienda;

    public ValeIncorrecto(int cantidad, String codigoMoneda, String tienda) {
        super(cantidad, codigoMoneda);
        this.tienda = tienda;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
//        if (getClass() != o.getClass()) return false;
        if (!(o instanceof ValeIncorrecto)) return false;
        
        final ValeIncorrecto otro = (ValeIncorrecto) o;
        if (this.cantidad != otro.cantidad) return false;

        boolean mismoCodigoMoneda = (this.codigoMoneda == null && otro.codigoMoneda == null)
                || (this.codigoMoneda != null && this.codigoMoneda.equals(otro.codigoMoneda));
        boolean mismaTienda = (this.tienda == null && otro.tienda == null)
                || (this.tienda != null && this.tienda.equals(otro.tienda));
        return mismoCodigoMoneda && mismaTienda;
    }
}
