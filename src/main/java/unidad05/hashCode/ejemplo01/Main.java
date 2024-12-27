package unidad05.hashCode.ejemplo01;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Almeria", "CD Almeria");
        Equipo e2 = new Equipo("Almeria", "CD Almeria");
        
        // Ambos objetos, aunque son iguales, tienen códigos hash diferentes:
        System.out.println("Son iguales? " + e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
    
}
