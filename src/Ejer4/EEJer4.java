package Ejer4;

public enum EEJer4 {

    MAS,
    MENOS,
    MULTIPLICAR,
    DIVIDIR;

    double calcular(double x, double y) {
        switch (this) {
            case MAS:
                return x + y;
            case MENOS:
                return x - y;
            case MULTIPLICAR:
                return x * y;
            case DIVIDIR:
                return x / y;
            default:
                throw new AssertionError("Operacion desconocida " + this);
        }
    }
}