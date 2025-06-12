package unidad07.apdo4_1;

public class Main {

    public static void main(String args[]) {
        Vehiculo v1 = new Automovil();
        v1.setMarca("Seat");
//        v1.setConsumo(4.8); // Dará error al compilar
//        v1.getConsumo(); // Dará error al compilar
        Automovil v2 = new Todoterreno();
        v2.setMarca("Toyota");
        v2.setConsumo(7.0);
        System.out.println(v2.getConsumo());
    }
}
