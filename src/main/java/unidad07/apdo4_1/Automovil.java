package unidad07.apdo4_1;

public class Automovil extends Vehiculo {

    protected double consumo; // consumo de combustible cada 100 km

    public void setConsumo(double c) {
        consumo = c;
    }

    public double getConsumo() {
        return consumo;
    }

}
