package unidad02;



public class Condicionales05 {

    public static void main(String[] args) {
        
        String clave = "ffff";
        int intentos = 0;
        final String CLAVE_VALIDA = "asdf";
        final int MAXIMO_INTENTOS = 3;
        boolean esClaveCorrecta = clave.equals(CLAVE_VALIDA);
        
        
        while (!esClaveCorrecta && intentos < MAXIMO_INTENTOS) {
            
            if (esClaveCorrecta) {
                System.out.println("Acceso permitido!!!");
            }
            else {
                System.out.println("Clave errónea.");
                clave = "asdf";
            }
            esClaveCorrecta = clave.equals(CLAVE_VALIDA);
            intentos++;

        }
        
        System.out.println("Fin de la ejecución ------");
        
        
        int num = 12;
        do {
            System.out.println(num);
            num++;
        } while(num <= 10);
    }
}
