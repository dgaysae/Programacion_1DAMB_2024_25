package unidad08.ejercicios;

/**
 * 
 * @author diego
 */
public class FechaIncorrectaException extends Exception {
    
    public FechaIncorrectaException(String message) {
        super(message);
    }
    
    public FechaIncorrectaException() {
        this("La fecha es incorrecta");
    }
}
