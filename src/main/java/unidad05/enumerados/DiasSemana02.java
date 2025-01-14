package unidad05.enumerados;

/**
 * 
 * @author diego
 */
public class DiasSemana02 {
    public static void main(String[] args) {
        System.out.println(DiasSemana.VIERNES.getNombre());
        System.out.println(DiasSemana.VIERNES.getNombreCorto());
        
        System.out.println("------------");
        for (int i = 0; i < DiasSemana.values().length; i ++) {
            System.out.println(DiasSemana.values()[i]);
        }
        System.out.println("------------");
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.println(dia);
        }
        
        System.out.println(
                getNombreDia(DiasSemana.MARTES)
        );
        
        
    }
    
    public static String getNombreDia(DiasSemana dia) {
        switch (dia) {
            case LUNES:
                return "Lunes";
            case MARTES:
                return "Martes";
            default:
                return "Error";
        }
    }
}
