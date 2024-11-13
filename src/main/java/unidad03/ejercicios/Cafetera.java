package unidad03.ejercicios;

/**
 *
 * @author diego
 */
public class Cafetera {
    private static final int CAPACIDAD_MINIMA = 350;
    
    private String marca;
    private int capacidadDepositoAgua;
    private int cantidadAguaDeposito = 0;
    private boolean hayCafe = false;
    private boolean hayPosos = false;
    
    public Cafetera(String marca,
            int capacidadDepositoAgua) {
        this.marca = marca;
        this.capacidadDepositoAgua = capacidadDepositoAgua;
    }
    
    public Cafetera(String marca) {
        this(marca, CAPACIDAD_MINIMA);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getCapacidadDepositoAgua() {
        return capacidadDepositoAgua;
    }
    
    public int getCantidadAguaDeposito() {
        return cantidadAguaDeposito;
    }
    
    public boolean hayCafe() {
        return hayCafe;
    }
    
    public boolean hayPosos() {
        return hayPosos;
    }
    
    public void setCapacidadDepositoAgua(int nuevaCapacidad) {
        if (nuevaCapacidad >= CAPACIDAD_MINIMA){
            capacidadDepositoAgua = nuevaCapacidad;
        }
        else {
            System.out.printf("ERROR! La capacidad mínima es de %d ml %n",
                    CAPACIDAD_MINIMA);
            System.out.println("No se ha cambiado el depósito.");
        }
    }
    
    public void aniadirAgua(int cantidadAgua) {
        cantidadAguaDeposito += cantidadAgua;
        if (cantidadAguaDeposito > capacidadDepositoAgua) {
            cantidadAguaDeposito = capacidadDepositoAgua;
        }
    }
    
    public void limpiarDepositoCafe() {
        if (hayPosos()) {
            hayPosos = false;
        }
        else {
            System.out.println("No hay posos en la cazoleta");
        }
    }
    
    public void ponerCafe() {
        if (!hayCafe && !hayPosos) {
            hayCafe = true;
        }
    }
    
    public void hacerCafe() {
        boolean aguaSuficiente = cantidadAguaDeposito >= CAPACIDAD_MINIMA;
        
        if (aguaSuficiente && hayCafe) {
            System.out.println("Café en marcha...");
            hayCafe = false;
            hayPosos = true;
            cantidadAguaDeposito = 0;
        }
        else{
            if (!aguaSuficiente) System.out.println("No hay suficiente agua");
            if (!hayCafe) System.out.println("No hay café");
            //System.out.println("Debe tener una cantidad mínima de agua y café.");
        }
    }
    
}
