package unidad04.interfaces;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        ComportamientoAnimal loboComun = new Lobo();
        ComportamientoAnimal perry = new Ornitorrinco();
        
        loboComun.alimentarse();
        loboComun.respirar();
        loboComun.morir();

        perry.alimentarse();
        perry.respirar();
        perry.morir();
        
        if (loboComun instanceof Lobo) {
            System.out.println("loboComun Es un Lobo");
        }
        else {
            System.out.println("NOOOOOOOOOOOO Es un Lobo");
        }
        
        if (perry instanceof Ornitorrinco) {
            System.out.println("perry Es un Ornitorrinco");
        }
        
        if (loboComun instanceof ComportamientoAnimal) {
            System.out.println("loboComun implementa ComportamientoAnimal");
        }
        
    }
}
