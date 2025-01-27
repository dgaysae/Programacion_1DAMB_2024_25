package unidad04.pokemon;

/**
 * 
 * @author diego
 */
public abstract class Pokemon {
    private static final int PUNTOS_PLACAJE = 20;
    private static final int TURNOS_AFECTADO = 3;
    private static final int PUNTOS_QUEMAR = 2;
    
    private String nombre;
    private boolean macho;
    private double altura;
    private double peso;
    private String origen;
    private int vida;
    private boolean paralizado = false;
    private boolean quemado = false;
    private int puntosQuemar = 0;
    private int turnosAfectado = 0;
    
    public Pokemon(
            String nombre,
            boolean macho,
            double altura,
            double peso,
            String origen,
            int vida) {
        
        this.nombre = nombre;
        this.macho = macho;
        this.altura = altura;
        this.peso = peso;
        this.origen = origen;
        this.vida = vida;
    }
    
    public Pokemon(
            String nombre,
            double altura,
            double peso,
            String origen,
            int vida) {
        
        this(nombre, true, altura, peso, origen, vida);
    }
    
    public void placar(Pokemon contrincante) {
        if (paralizado) {
            System.out.println(nombre + " está paralizado y no puede atacar.");
            setTurno();
            return;
        }
        
        contrincante.recibirAtaque(PUNTOS_PLACAJE);
        System.out.println(nombre + " hace placaje a " + contrincante.nombre);
        
        if (quemado) {
            puntosQuemar += PUNTOS_QUEMAR;
            vida -= puntosQuemar;
        }
    }
    
    protected void recibirAtaque(int puntosVida) {
        vida -= puntosVida;
        if (vida < 0) {
            vida = 0;
            System.out.println(nombre + " ha muerto en el ataque.");
        }
    }
    
    private void setTurno() {
        turnosAfectado++;
        if (turnosAfectado > TURNOS_AFECTADO) {
            paralizado = false;
            quemado = false;
            turnosAfectado = 0;
            puntosQuemar = 0;
        }
    }

    public String toString() {
        return "Pokemon{nombre=" + nombre + ""
                + "\n\t macho=" + macho
                + "\n\t altura=" + altura
                + "\n\t peso=" + peso
                + "\n\t origen=" + origen
                + "\n\t vida=" + vida
                + "\n\t quemado=" + quemado
                + "\n\t paralizado=" + paralizado
                + "\n\t puntosQuemar=" + puntosQuemar
                + "\n\t turnosAfectado=" + turnosAfectado
                + "\n}";
    }
}
