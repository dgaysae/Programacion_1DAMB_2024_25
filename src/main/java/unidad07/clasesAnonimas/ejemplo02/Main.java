package unidad07.clasesAnonimas.ejemplo02;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        Alumno manu = new Alumno();
        manu.toser();

        ToserEnClase manu2 = new ToserEnClase() {
            @Override
            public void toser() {
                System.out.println("Cof, cof!");
            }
        };
        
        manu2.toser();
    }
}
