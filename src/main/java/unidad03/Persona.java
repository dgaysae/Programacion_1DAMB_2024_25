package unidad03;

/**
 *
 * @author diego
 */
public class Persona {
    
    // Atributos de la clase
    protected static final int EDAD_MINIMA = 11;
    public static final double ESTATURA_MEDIA = 1.50;
    
    private static int contadorPersonas = 0;
    private String nombre = "";
    private String apellidos = "";
    private int edad = 0;
    private double altura = 0;
    
    // Constructores
    public Persona(String nombre,
            String apellidos,
            int edad,
            double altura) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        setEdad(edad);
        setAltura(altura);
        
        contadorPersonas++;
    }
    
    public Persona(String nombre,
            String apellidos,
            double altura) {

        this(nombre, apellidos, EDAD_MINIMA, altura);
/*
        this.nombre = nombre;
        this.apellidos = apellidos;
        edad = EDAD_MINIMA;
        setAltura(altura);
*/
    }
    
    public Persona(String nombre, String apellidos) {
        this(nombre, apellidos, ESTATURA_MEDIA);
    }
    
    // Getters / Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String filtrarCaracteres(String texto) {
        final String NO_PERMITIDOS = "0123456789";
        String cadenaFiltrada = "";
        
       // texto.replace(NO_PERMITIDOS.charAt(0), "");
        
        return cadenaFiltrada;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        if (edad < EDAD_MINIMA){
            this.edad = EDAD_MINIMA;
        }            
        else{
            this.edad = edad;
        }
        
        //La siguientes es equivalente, usando el operador ternario ? :
        //this.edad = (edad < 0) ? 0 : edad;
        
    }
    
    public int getEdad() {
        return edad;
    }

    public void setAltura(double altura) {
        this.altura = (altura < 0) ? ESTATURA_MEDIA : altura;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public int getContadorPersonas() {
        return contadorPersonas;
    }

    // Métodos
    /**
     * 
     */
    static public void saludar() {
        System.out.println("Hola!!");
    }
}
