package unidad04.examen;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {

        Profesorado pro1 = new Profesorado("Pepe", 25, "Español");
        Profesorado pro2 = pro1.clone();
        pro1.cambiaIdioma("és#");
        
        System.out.println(pro1);
        System.out.println(pro2);
        
//        Alumnado a1 = new Alumnado("Alumnado", 25, "inglés", "C2");
//        System.out.println("Alumnado: " + a1.pagoMensual());
        Presencial pres = new Presencial("Presencial", 25, "inglés", "C2", 10);
        System.out.println("Presencial: " + pres.pagoMensual());
    }
    

}
