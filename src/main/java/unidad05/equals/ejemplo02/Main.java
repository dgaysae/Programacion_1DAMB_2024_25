package unidad05.equals.ejemplo02;

import unidad05.equals.ejemplo01.*;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        Dinero dinero = new Dinero(55, "USD");
        ValeIncorrecto pagoCompra = new ValeIncorrecto(55, "USD", "PCComponentes");
        System.out.println(dinero.equals(pagoCompra));
        System.out.println(pagoCompra.equals(dinero));
    }

}
