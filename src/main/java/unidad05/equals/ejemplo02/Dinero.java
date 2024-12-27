package unidad05.equals.ejemplo02;

/**
 * Ejemplo extraído de:
 * https://www.baeldung.com/java-equals-hashcode-contracts
 * 
 * El método equals() debe cumplir las siguientes normas:
 *  - reflexivo: un objeto debe ser igual a sí mismo.
 *  - simétrico: x.equals(y) debe devolver el mismo resultado que y.equals(x)
 *  - transitivo: si x es igual a (y) e y es igual a (z), entonces también x es igual a (z)
 *  - consistente: el valor de . equals() debe cambiar solo si cambia una propiedad contenida en . equals() (no se permite aleatoriedad)
 * Fuente: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)
 * 
 * @author diego
 */
public class Dinero {
    int cantidad;
    String codigoMoneda;

    public Dinero(int cantidad, String codigoMoneda) {
        this.cantidad = cantidad;
        this.codigoMoneda = codigoMoneda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
//        if (getClass() != o.getClass()) return false;
        if (!(o instanceof Dinero)) return false;
        
        final Dinero otro = (Dinero) o;
        if (this.cantidad != otro.cantidad) return false;
        
        return (this.codigoMoneda == null && otro.codigoMoneda == null)
                || (this.codigoMoneda != null && this.codigoMoneda.equals(otro.codigoMoneda));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cantidad;
        hash = 97 * hash + this.codigoMoneda.hashCode();
        return hash;
    }

}
