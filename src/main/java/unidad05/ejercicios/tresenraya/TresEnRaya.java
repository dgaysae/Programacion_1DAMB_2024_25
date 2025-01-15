package unidad05.ejercicios.tresenraya;

public class TresEnRaya {
    private static Fichas[][] tablero = new Fichas[3][3];
    private boolean turno = false;
    private Fichas jugadorTurno;

    public TresEnRaya() {
        inicializarTablero();
        mostrarTablero();
    }

    /**
     * Imprime el tablero por pantalla
     */
    private void mostrarTablero() {
    }

    /**
     * Vacía el tablero, dejando todas las casillas vacías.
     */
    private void inicializarTablero() {

    }

    /**
     * Hace la jugada teniendo en cuenta el turno. Si turno es true, le tocará
     * al jugador que usa la cruz, si es false, al jugador que usa el círculo.
     */
    public void jugarTurno() {

    }

}
