package unidad08.ejercicios;

import java.time.LocalDate;

/**
 *
 * @author diego
 */
public interface InterfazConExcepcion {
    
    public LocalDate getFecha() throws FechaIncorrectaException;
    
}
