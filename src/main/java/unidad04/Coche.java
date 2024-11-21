package unidad04;

/**
 * 5.3 Constructor copia.
 * 
 * @author diego
 */
public class Coche {
    private String marca;
    private int caballos;
    private String color;
    private String matricula;
    
    public Coche(String marca,
            int caballos,
            String matricula,
            String color
            ) {
        this.marca = marca;
        this.caballos = caballos;
        this.color = color;
        this.matricula = matricula;
    }
    
    public Coche(String marca,
            int caballos,
            String matricula) {
        this(marca, caballos, matricula, "Blanco");
    }
    
    /**
     * Constructor copia 1
     * Se pueden inicializar los atributos uno a uno (comentado) o se puede
     * usar el constructor con todos los parámetros.s
     * 
     * @param c 
     */
    public Coche(Coche c) {
//        this.marca = c.marca;
//        this.caballos = c.caballos;
//        this.color = c.color;
        
        this(c.marca, c.caballos, "", c.color);
    }
    
    /**
     * Constructor copia 2
     * 
     * @param c
     * @param matricula 
     */
    public Coche(Coche c, String matricula) {
        this(c.marca, c.caballos, matricula, c.color);        
    }
    
    public String toString() {
        return "Coche {"
                + "matrícula: " + matricula + ", "
                + "marca: " + marca + ", "
                + "caballos: " + caballos + ", "
                + "color: " + color + "}";
    }
    
    
}
