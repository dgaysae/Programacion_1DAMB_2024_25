
package unidad04.examen;

/**
 *
 * @author diego
 */
public abstract class Alumnado extends Persona implements Estudiante {

    public static final double CUOTA_FIJA = 90;
    public static final String A1 = "A1";
    public static final String A2 = "A2";
    public static final String B1 = "B1";
    public static final String B2 = "B2";
    public static final String C1 = "C1";
    public static final String C2 = "C2";
    
    private String idioma;
    private String nivel;
    
    public Alumnado(
            String nombre,
            int edad,
            String idioma,
            String nivel) {
        
        super(nombre, edad);
        cambiarIdioma(idioma);
        setNivel(nivel);
    }

    
    public void cambiarIdioma(String idioma){
        if (valorValido(Profesorado.getValoresValidos(), idioma)){
            this.idioma = idioma;
        }else{
            this.idioma = "No asignado";
        }
    }
    
    private void setNivel(String nivel) {
        if (valorValido(getValoresValidos(), nivel)){
            this.nivel = nivel;
        }else{
            this.nivel = "No asignado";
        }
    }
    
    public double pagoMensual() {
        return CUOTA_FIJA;
    }
    
    public static String getValoresValidos() {
        return "#" + A1
                + "#" + A2
                + "#" + B1
                + "#" + B2
                + "#" + C1
                + "#" + C2
                + "#";
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Idioma:" + idioma
                + ", Nivel:" + nivel;

    }


   
}
