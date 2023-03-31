package Ejer5;

public enum Tamaño {

    PEQUEÑA("El tamañoe es: pequeña."),
    MEDIANA("El tamañoe es: mediana."),
    GRANDE("El tamañoe es: grande."),
    FAMILIAR("El tamañoe es: familiar.");

    private final String tamañoPizza;

    // private enum constructor
    private Tamaño(String tamañoPizza) {
        this.tamañoPizza = tamañoPizza;
    }



    public String getSize() {
        return tamañoPizza;
    }

}
