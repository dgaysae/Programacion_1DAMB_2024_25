package unidad05.ejercicios.ejercicioAnterior;

/**
 *
 * @author diego
 */
public class MainCoche {
    public static void main(String[] args) {
        Coche c1 = new Coche("Opel",
                "Astra",
                "Blanco anacarado",
                40,
                60,
                120,
                80000);
        // Sin enumerados puedo introducir cualquier entero:
        c1.pincharRueda(Coche.RUEDA_DELANTERA_DCHA);
        c1.pincharRueda(-5671);

        /*
        Los enumerados proporcionan un type-safe, es decir,
        sólo puedo introducir uno de los valores contemplados
        en el enum.
         */
        c1.pincharRueda(Neumaticos.DELANTERO_DCHO);
        c1.pincharRueda(Neumaticos.DELANTERO_IZQDO);

        System.out.println("Rueda 1 ----------------");
        System.out.println(c1.getRueda(1));
        System.out.println("Rueda 2 ----------------");
        System.out.println(c1.getRueda(2));
        System.out.println("Rueda 3 ----------------");
        System.out.println(c1.getRueda(3));
        System.out.println("Rueda 4 ----------------");
        System.out.println(c1.getRueda(4));

        Coche clonSuperficial = c1;
    }
}