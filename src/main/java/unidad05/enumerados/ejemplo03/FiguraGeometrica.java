package unidad05.enumerados.ejemplo03;

public enum FiguraGeometrica {
    CIRCUNFERENCIA(1) {
        @Override
        public double calcularArea(double... dimensiones) {
            if (dimensiones.length != getNumeroDimensiones()) {
                throw new IllegalArgumentException("Un círculo necesita el radio");
            }
            double radio = dimensiones[0];
            return Math.PI * radio * radio;
        }
    },
    CUADRADO(1) {
        @Override
        public double calcularArea(double... dimensiones) {
            if (dimensiones.length != getNumeroDimensiones()) {
                throw new IllegalArgumentException("Un cuadrado necesita un lado");
            }
            double lado = dimensiones[0];
            return lado * lado;
        }
    },
    RECTANGULO(2) {
        @Override
        public double calcularArea(double... dimensiones) {
            if (dimensiones.length != getNumeroDimensiones()) {
                throw new IllegalArgumentException("Un rectángulo necesita la base y la altura.");
            }
            double base = dimensiones[0];
            double altura = dimensiones[1];
            return base * altura;
        }
    },
    TRIANGULO(2) {
        @Override
        public double calcularArea(double... dimensiones) {
            if (dimensiones.length != getNumeroDimensiones()) {
                throw new IllegalArgumentException("Un triángulo necesita la base y una altura");
            }
            double base = dimensiones[0];
            double altura = dimensiones[1];
            return (base * altura) / 2;
        }
    };

    private final int numeroDimensiones;

    private FiguraGeometrica(int numeroDimensiones) {
        this.numeroDimensiones = numeroDimensiones;
    }

    public int getNumeroDimensiones() {
        return numeroDimensiones;
    }

    public abstract double calcularArea(double... dimensiones);
}