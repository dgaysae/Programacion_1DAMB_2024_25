package unidad03;

/**
 *
 * @author diego
 */
public class MainPersona {

    public static void main(String[] args) {
        //Cuando no defino un constructor, se usa el constructor por defecto:
//        Persona pers1 = new Persona();
//        System.out.println("Nombre: " + pers1.getNombre());
//        System.out.println("Apellidos: " + pers1.getApellidos());
//        System.out.println("Estatura: " + pers1.getAltura());
//        System.out.println("Edad: " + pers1.getEdad());

//        pers1.setNombre("Pepe");
//        pers1.setApellidos("López Escánez");
//        pers1.setEdad(-120);
//        pers1.setAltura(1.76);
//        
//        System.out.println("Nombre: " + pers1.getNombre());
//        System.out.println("Apellidos: " + pers1.getApellidos());
//        System.out.println("Estatura: " + pers1.getAltura());
//        System.out.println("Edad: " + pers1.getEdad());
        
        /*
        Un atributo estático (o atributo de clase) puede verse (si es público)
        sin necesidad de instanciar un objeto de esa clase:
        */
        System.out.println("--->>> " + Persona.EDAD_MINIMA);
        System.out.println("--->>> " + Persona.ESTATURA_MEDIA);
        // Lo mismo ocurre con los métodos estáticos:
        Persona.saludar();

        /*
        Aunque también puede verse desde el objeto, ya que en definitiva es
        un atributo de la clase:
        */
        Persona pers = new Persona("Pepe", "López Sánchez", 12, 1.90);
        System.out.println("--->>> " + pers.EDAD_MINIMA);
        
        pers.saludar();
//        printDatosPersona(pers);
//
//        Persona pers1 = new Persona("Ana", "Jorl Norl", 1.50);
//        printDatosPersona(pers1);

        System.out.println("El valor absoluto de -7 es = " + Math.abs(-7));
        
    }

    public static void printDatosPersona(Persona pers) {
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Apellidos: " + pers.getApellidos());
        System.out.println("Estatura: " + pers.getAltura());
        System.out.println("Edad: " + pers.getEdad());
        System.out.printf("cont. Personas: %d ---------------------%n",
                pers.getContadorPersonas());
    }
}
