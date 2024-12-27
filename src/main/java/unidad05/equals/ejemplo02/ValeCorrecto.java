package unidad05.equals.ejemplo02;

/**
 * Ejemplo extraído de: https://www.baeldung.com/java-equals-hashcode-contracts
 *
 * @author diego
 */
public class ValeCorrecto {
    private Dinero dinero;
    private String tienda;

    public ValeCorrecto(int cantidad, String codigoMoneda, String tienda) {
        this.dinero = new Dinero(cantidad, codigoMoneda);
        this.tienda = tienda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
//        if (getClass() != o.getClass()) return false;
        if (!(o instanceof ValeCorrecto)) return false;
        
        final ValeCorrecto otro = (ValeCorrecto) o;

        boolean mismoDinero = (this.dinero == null && otro.dinero == null)
                || (this.dinero != null && this.dinero.equals(otro.dinero));
        boolean mismaTienda = (this.tienda == null && otro.tienda == null)
                || (this.tienda != null && this.tienda.equals(otro.tienda));
        return mismoDinero && mismaTienda;
    }    
}
