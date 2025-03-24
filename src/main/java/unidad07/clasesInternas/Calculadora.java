package unidad07.clasesInternas;

/**
 * CLASES ANIDADAS
 * Aunque formalmente son clases internas, se les llama así a las clases anidadas estáticas. Es decir, no
 * requieren su instanciación como objeto.
 * Estas clases no pueden acceder a los miembros (atributos y métodos) de la clase que las contiene, ya que requieren
 * que esté instanciada.
 */public class Calculadora {
    private static int numOperaciones = 0;

    public static int getNumOperaciones() {
        return numOperaciones;
    }

    public static class Operaciones {
        public static int sumar(int... sumandos) {
            int suma = 0;
            for(int sumando : sumandos) {
                suma += sumando;
                numOperaciones++;
            }
            numOperaciones--;
            return suma;
        }

        public static int restar(int... restandos) {
            int resta = 0;
            for(int restando : restandos) {
                resta -= restando;
                numOperaciones++;
            }
            numOperaciones--;
            return resta;
        }
    }
}
