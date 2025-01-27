package unidad04.pokemon;

/**
 * 
 * @author diego
 */
public class Electrico extends Pokemon {
    public Electrico(
            String nombre,
            boolean macho,
            double altura,
            double peso,
            String origen,
            int vida) {

        super(nombre, altura, peso, origen, vida);
    }
    
    public void paralizar(Pokemon contrincante) {
        placar(contrincante);
        int porcentajeParalisis = (int)(Math.random() * 101);
        if (porcentajeParalisis >= 75) {
            
        }
    }
}
