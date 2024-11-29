package unidad04.examen;

/**
 *
 * @author diego
 */
public class Profesorado extends Persona {

    private String idioma;
    public static final String INGLES = "inglés";
    public static final String FRANCES = "francés";
    public static final String ALEMAN = "alemán";

    public Profesorado(String nombre,
            int edad, String idioma) {
        super(nombre, edad);
        cambiaIdioma(idioma);
    }

    public String getIdioma() {
        return idioma;
    }

    public void cambiaIdioma(String nuevo) {
        nuevo = nuevo.toLowerCase();

//        if(nuevo.equals(INGLES) || nuevo.equals(FRANCES) || nuevo.equals(ALEMAN)){
//            this.idioma = nuevo;
//        }else{
//            idioma = "No asignado";
//        }

        if (valorValido(getValoresValidos(), nuevo)) {
            this.idioma = nuevo;
        } else {
            idioma = "No asignado";
        }

    }

    public static String getValoresValidos() {
        return "#" + INGLES + "#" + FRANCES + "#" + ALEMAN + "#";
    }
    
    

    public Profesorado clone() {
        return new Profesorado(getNombre(), getEdad(), this.idioma);
    }

    @Override
    public String toString() {
        return super.toString() + ", Idioma:" + idioma;

    }

}
