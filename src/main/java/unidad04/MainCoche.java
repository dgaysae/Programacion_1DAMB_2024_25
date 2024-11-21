package unidad04;

/**
 * 5.3 Constructor copia.
 * 
 * @author diego
 */
public class MainCoche {

    public static void main(String[] args) {
        Coche c1 = new Coche("Nissan", 120, "1111-AAA");
        System.out.println("c1 = " + c1);
        
        Coche c2 = new Coche(c1);
        System.out.println("c2 = " + c2);

        Coche c3 = new Coche(c1, "3333-CCC");
        System.out.println("c3 = " + c3);
        
        c3 = c2;
    }
    
}
