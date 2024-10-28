package unidad02;



public class Condicionales03 {

    public static void main(String[] args) {
        
        // Esta clave la introduce el usuario:
        String clave = "Asdf";
        
        // Esta clave es la guardada en el servidor:
        final String CLAVE_VALIDA = "asdf";
        
        if (clave.equals(CLAVE_VALIDA)) {
            System.out.println("Access granted!");
        }
        else {
            System.out.println("ERROR! Try again");
        }
        
    }
}
