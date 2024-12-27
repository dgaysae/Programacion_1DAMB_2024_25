package unidad05.hashCode.ejemplo01;

/**
 * Ejemplo extraído de: https://www.baeldung.com/java-equals-hashcode-contracts
 *
 * El método .hashCode() se utiliza para comparar objetos en estructuras de datos
 * que utilicen tablas hash.
 * 
 * Este método devuelve un entero que representa la instancia actual
 * de la clase. Debemos calcular este valor de manera coherente con la
 * definición del método equals().
 *
 * @author diego
 */
public class Equipo {
    private String ciudad;
    private String nombre;

    public Equipo(String ciudad, String nombre) {
        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        
        final Equipo otro = (Equipo) o;
        if (!this.ciudad.equals(otro.ciudad)) return false;
        
        return this.nombre.equals(otro.nombre);
    }
    
    
}
