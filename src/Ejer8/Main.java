package Ejer8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Sandra");
        nombres.add("JImena");
        nombres.add("Mary");

        System.out.println(nombres);

        nombres.set(2,"martin");

        System.out.println("nombrea añadido en psicion 2: "+nombres);


    }
}
