package unidad03.ejercicios;

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
        c1.pincharRueda(1);
        c1.pincharRueda(2);
        System.out.println("Rueda 1 ----------------");
        System.out.println(c1.getRueda(1));
        System.out.println("Rueda 2 ----------------");
        System.out.println(c1.getRueda(2));
        System.out.println("Rueda 3 ----------------");
        System.out.println(c1.getRueda(3));
        System.out.println("Rueda 4 ----------------");
        System.out.println(c1.getRueda(4));
    }
}
