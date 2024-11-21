package unidad04;

/**
 * 
 * @author diego
 */
public class MainPersona {
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", "López Sánchez", 45, 1.92);
        System.out.println(p1);
        
        System.out.println("---------- clon superficial ----------");
        Persona clonSuperficial = p1;
        System.out.println(clonSuperficial);
        System.out.println("El clon superficial y el objeto son iguales? "
                + (p1.equals(clonSuperficial)));
        
        clonSuperficial.setNombre("José");
        System.out.println(p1);
        
        System.out.println("---------- clon en profundidad ----------");
        Persona clonProfundidad = p1.clone();
        System.out.println(clonProfundidad);
        System.out.println("El clon en profundidad y el objeto son iguales? "
                + (p1.equals(clonProfundidad)));

        p1.setNombre("Anselmo");
        System.out.println("El clon en profundidad y el objeto son iguales? "
                + (p1.equals(clonProfundidad)));
        
        
        clonProfundidad.setEdad(89);
        System.out.println(clonProfundidad);
        System.out.println(p1);
        
        
        boolean esInstanciade = p1 instanceof Object;
        System.out.println("Persona es de tipo Object? - " + esInstanciade);
        
    }
    
}
