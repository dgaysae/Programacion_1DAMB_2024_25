package unidad04.interfaces;

/**
 * 
 * @author diego
 */
public class Lobo implements ComportamientoAnimal {

    @Override
    public void alimentarse() {
        System.out.println("Come carne");
    }

    @Override
    public void respirar() {
        System.out.println("Por los pulmones");
    }

    @Override
    public void reproducirse() {
        System.out.println("Ñaca ñaca con loba");
    }

    @Override
    public void morir() {
        System.out.println("Estira la pata");
    }
    
}
