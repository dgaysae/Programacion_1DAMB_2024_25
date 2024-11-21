package unidad04;

/**
 * 4.1 Paso de parámetros por valor
 *
 * @author diego
 */
public class PasoParametros {

    private static int numero = 3;

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 7;
        /**
         * En el paso por valor, se hace una copia del parámetro que se pasa a
         * la función, por lo que la variable original no se modifica.
         */
        System.out.println("Paso de parámetros por valor --------------");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int valorSuma = sumaSorpresa(num1, num2);
        System.out.println("La suma es " + valorSuma);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        Persona p = new Persona("Pepe", "López Sánchez", 45, 1.92);
        System.out.println("Edad = " + p.getEdad());
        p.setEdad(num2);
        System.out.println("num2 = " + num2);

        /**
         * El paso por referencia oficialmente no existe en Java, pero sis pasas
         * un objeto como parámetro en una función, lo que se pasa es su
         * referencia, es decir, la dirección de memoria del objeto.
         */
        System.out.println("Paso de parámetros por referencia --------------");
        System.out.println("Edad persona = " + p.getEdad());
        duplicarEdad(p);
        System.out.println("Edad persona = " + p.getEdad());

        /**
         * Vamos a sumar dos números representados por Integer.
         */
        Integer num3 = 6;
        Integer num4 = 2;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        valorSuma = sumaObjetos(num3, num4);
        System.out.println("La suma es " + valorSuma);
        
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }

    /**
     * A los parámetros de entrada se les cambiará el valor por sorpresa.
     *
     * @param a Primer sumando
     * @param b Segundo sumando
     * @return Suma de los parámetros, con los cambios sorpresa aplicados.
     */
    public static int sumaSorpresa(int a, int b) {
        a *= b;
        b -= numero;
        int sumaFinal = a + b;
        return sumaFinal;
    }

    /**
     * Se pasa un objeto tipo Persona como parámetro. Realmente se pasa la
     * referencia del objeto.
     *
     * @param p Objeto tipo Persona
     */
    public static void duplicarEdad(Persona p) {
        int edadPersona = p.getEdad();
        p.setEdad(2 * edadPersona);
    }

    public static int sumaObjetos(Integer a, Integer b) {
        a *= b;
        b -= numero;
        int sumaFinal = a + b;
        return sumaFinal;
    }

}
