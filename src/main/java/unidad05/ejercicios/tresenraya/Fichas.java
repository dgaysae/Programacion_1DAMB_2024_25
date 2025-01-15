package unidad05.ejercicios.tresenraya;

public enum Fichas {
    CRUZ("X"),
    CIRCULO("O"),
    VACIO(" ");

    private final String ficha;

    private Fichas(String ficha) {
        this.ficha = ficha;
    }

    public String getFicha() {
        return this.ficha;
    }
}
