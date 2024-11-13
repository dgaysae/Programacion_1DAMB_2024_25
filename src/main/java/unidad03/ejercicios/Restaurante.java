package unidad03.ejercicios;

/**
 * 
 * @author diego
 */
public class Restaurante {
    private int huevos;
    private double kgChorizo;
    
    private static final int HUEVOS_POR_PLATO = 2;
    private static final int CHORIZO_POR_PLATO = 200;   // ¿DOUBLE MEJOR?
    private static final int HUEVOS_POR_DOCENA = 12;
    private static final int GR_POR_KG = 1000;
    
    public Restaurante(int docenas, double kgChorizo) {
        addHuevos(docenas);
        addChorizos(kgChorizo);
    }
    
    public void addHuevos(int docenas) {
        huevos += (docenas > 0)
                ? docenas * HUEVOS_POR_DOCENA
                : 0;
    }
    
    public void addChorizos(double kgChorizo) {
        if (kgChorizo > 0) {
            this.kgChorizo += kgChorizo;
        }
    }
    
    public int getNumPlatos() {
        int platosHuevos = huevos / HUEVOS_POR_PLATO;
        double platosChorizo = (kgChorizo * GR_POR_KG) / CHORIZO_POR_PLATO;
        
        if (platosHuevos > platosChorizo)
            return (int)platosChorizo;
        else
            return platosHuevos;
    }
}
