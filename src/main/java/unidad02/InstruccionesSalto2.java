package unidad02.ejemplosClase;

/**
 * Este programaasñl dfkjasñldj fsadflk jñasdf
 * asñd flkjasñdflkjasdf
 * asñdfl kjañsldfjañsldfkjasñflkjasñdf
 * añsldf jkañsldf.
 * 
 * @author Diego Gay Sáez
 * @see Conmutadores
 */
public class InstruccionesSalto2 {

    public static void main(String[] args) {

        InstruccionesSalto2 instr = new InstruccionesSalto2();
        instr.imprimirSuma(0, 0);
        instr.suma(0, 0);
        
        for (int contador = 0; contador < 20; contador++) {
            if (contador % 2 != 0) {
                continue;   // salto al siguiente si es impar
            }
            System.out.println(contador);
        }

    }
    
    /**
     * Imprime por pantalla la suma de los números introducidos.
     * @param a Primer sumando.
     * @param b Segundo sumando.
     */
    public static void imprimirSuma(int a, int b) {
        System.out.printf("%d + %d = %d \n", a, b, a + b);
    }
    
    /**
     * Suma los números introducidos.
     * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return Suma de los parámetros de entrada.
     */
    public static int suma(int a, int b) {
        return a + b;
    }

}
