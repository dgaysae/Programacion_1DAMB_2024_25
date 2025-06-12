package unidad07.wrappers;

public class ModeloCalc {

    private String memoria1;
    private String memoria2;
    private String operacion;

    public ModeloCalc() {
        memoria1 = "0";
        memoria2 = "0";
        operacion = "";
    }

    public String getMemoria1() {
        return memoria1;
    }

    public void setMemoria1(String memoria1) {
        this.memoria1 = memoria1;
    }

    public String getMemoria2() {
        return memoria2;
    }

    public void setMemoria2(String memoria2) {
        this.memoria2 = memoria2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String opera() {
        Double resultado = 0.0;
        switch (operacion) {
            case "-":
                resultado = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);
                break;
            case "+":
                resultado = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);
                break;
            case "*":
                resultado = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);
                break;
            case "/":
                resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);
        }
        return resultado.toString();
    }

}
