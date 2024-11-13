package unidad03;

/**
 *
 * @author Manuel Piñero
 */
public class Cafetera {

    // Atributos
    private String marca;
    private int capacidadAgua; // el deposito de la cafetera debe ser mayor a 350 ml que es la cantidad mínima para hacer café
    private int cantidadAgua;
    private boolean depositoConCafe;
    private boolean depositoConPosos;

    // Constructor
    public Cafetera(String m, int cap) {
        this.marca = m;
        this.cantidadAgua = 0;
        this.depositoConCafe = false;
        this.depositoConPosos = false;
        if (cap >= 350) {
            this.capacidadAgua = cap;
        } else {
            System.out.println("La capacidad indicada es muy pequeña, se creará la cafetera con una capacidad de 350 ml");
            this.capacidadAgua = 350;
        }
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void aniadirAgua(int nuevaCantidad) {
        if (cantidadAgua + nuevaCantidad > capacidadAgua) {
            cantidadAgua = capacidadAgua;
            System.out.println("Se ha derramado agua");
        } else {
            cantidadAgua += nuevaCantidad;
        }
    }

    public int getCapacidadAgua() {
        return capacidadAgua;
    }

    public void setCapacidadAgua(int nuevaCapacidad) {
        if (nuevaCapacidad >= 350) {
            this.capacidadAgua = nuevaCapacidad;
        } else {
            System.out.println("La capacidad indicada es muy pequeña y no se modificará la cafetera");
        }
    }

    public boolean hayCafe() {
        return depositoConCafe;
    }

    public boolean hayPosos() {
        return depositoConPosos;
    }

    public void limpiarDepositoCafe() {
        if (hayPosos()) {
            depositoConPosos = false;
        } else {
            System.out.println("No hay posos en el depósito");
        }
    }

    public void ponerCafe() {
        if (hayCafe() || hayPosos()) {
            System.out.println("El depósito de café está lleno");
        } else {
            depositoConCafe = true;
        }
    }

    // Métodos públicos
    public void hacerCafe() {
        if (cantidadAgua >= 350 && hayCafe()) {
            System.out.println("Haciendo café...");
            cantidadAgua = 0;
            depositoConCafe = false;
            depositoConPosos = true;
            System.out.println("Café listo.");
        } else {
            System.out.println("No hay suficiente agua o café para hacer el café.");
        }
    }

    public static void main(String[] args) {
        Cafetera caf = new Cafetera("jata", 300);
        caf.hacerCafe();
        caf.ponerCafe();
        caf.hacerCafe();
        caf.aniadirAgua(340);
        caf.hacerCafe();
        caf.aniadirAgua(40);
        caf.hacerCafe();

        caf.setCapacidadAgua(500);
        caf.aniadirAgua(400);
        caf.hacerCafe();
        caf.ponerCafe();
        caf.limpiarDepositoCafe();
        caf.hacerCafe();
        caf.ponerCafe();
        caf.hacerCafe();
    }
}
