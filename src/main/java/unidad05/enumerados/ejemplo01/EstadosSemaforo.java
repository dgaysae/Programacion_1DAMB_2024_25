package unidad05.enumerados.ejemplo01;

/**
 * Este enum usa el método cambiaEstado para pasar de una luz
 * a otro siguiendo la secuencia correcta.
 */
public enum EstadosSemaforo {
    ROJO, AMARILLO, VERDE;

    public EstadosSemaforo cambiaEstado() {
        switch (this) {
            case ROJO: return AMARILLO;
            case AMARILLO: return VERDE;
            case VERDE: return ROJO;
            default: throw new IllegalStateException("Estado no válido para el semáforo");
        }
    }
}