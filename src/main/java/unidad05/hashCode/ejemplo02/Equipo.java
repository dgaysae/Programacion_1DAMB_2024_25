package unidad05.hashCode.ejemplo02;

import java.util.Objects;

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
 * Java SE define un contrato para el método .hashCode():
 * 1. Consistencia interna: el valor de hashCode() solo puede cambiar si cambia
 * una propiedad que está en equals()
 * 2. Consistencia de igualdad: los objetos que son iguales entre sí deben
 * devolver el mismo código hash.
 * 3. colisiones: objetos desiguales pueden tener el mismo código hash.
 *
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.ciudad.hashCode();
        hash = 17 * hash + this.nombre.hashCode();
        return hash;
    }
    
    
}
