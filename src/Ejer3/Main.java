package Ejer3;

public class Main {
    public static void main(String[] args) {
        EEjer3 arr[] = EEjer3.values();

        for (EEjer3 col : arr) {
            System.out.println(col + " at index " + col.ordinal());
        }

        System.out.println(EEjer3.valueOf("RED"));
    }
}
