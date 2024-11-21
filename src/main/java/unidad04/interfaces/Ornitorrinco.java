package unidad04.interfaces;

/**
 *
 * @author diego
 */
public class Ornitorrinco implements ComportamientoAnimal {

    @Override
    public void alimentarse() {
        System.out.println("Comer de tó");
    }

    @Override
    public void respirar() {
        System.out.println("También tiene pulmones");
    }

    @Override
    public void reproducirse() {
        System.out.println("Ñaca ñaca con la ornitorrinca");
    }

    @Override
    public void morir() {
        System.out.println("estira la pata tambiél");
    }
    
}
