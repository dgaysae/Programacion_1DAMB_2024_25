package unidad05.hashCode.ejemplo02;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Almeria", "CD Almeria");
        Equipo e2 = new Equipo("Almeria", "CD Almeria");
        
        /*
        Ahora ambos objetos son iguales y devuelven el mismo hash:
        */
        System.out.println("Son iguales? " + e1.equals(e2));
        System.out.println("Tienen el mismo hash? " + (e1.hashCode() == e2.hashCode()));
    }
    
}
