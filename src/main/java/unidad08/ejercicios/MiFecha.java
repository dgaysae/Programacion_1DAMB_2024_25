package unidad08.ejercicios;

/**
 *
 * @author diego
 */
public class MiFecha {
    private int day;
    private int month;
    private int year;
    
    public MiFecha(int day, int month, int year) throws FechaIncorrectaException {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new FechaIncorrectaException();
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
