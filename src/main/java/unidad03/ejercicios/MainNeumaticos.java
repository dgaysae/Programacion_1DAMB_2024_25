package unidad03.ejercicios;

/**
 *
 * @author diego
 */
public class MainNeumaticos {

    public static void main(String[] args) {
        Neumatico rueda1 = new Neumatico(120, 90, 80000);

        System.out.println("Presión: " + rueda1.getPresion());
        System.out.println("Km recorridos: " + rueda1.getKmRecorridos());
        System.out.println("Desgastado? " + rueda1.estaDesgastado());

        System.out.println("Presión recomendada: "
                + rueda1.getPresionRecomendada());

        rueda1.inflar(10);
        System.out.println("Presión: " + rueda1.getPresion());

        rueda1.pierdePresion(-20);
        System.out.println("Presión: " + rueda1.getPresion());

        rueda1.recorrer(1000);
        System.out.println("Km recorridos: " + rueda1.getKmRecorridos());
        System.out.println("Desgastado? " + rueda1.estaDesgastado());
        rueda1.recorrer(100000);
        System.out.println("Km recorridos: " + rueda1.getKmRecorridos());
        System.out.println("Desgastado? " + rueda1.estaDesgastado());

        rueda1.pinchar();
        System.out.println("Presión: " + rueda1.getPresion());

        rueda1.inflar(100);
        System.out.println("Presión: " + rueda1.getPresion());
        
        System.out.println(rueda1);        
        
    }

}
