package ro.trc.ziua2;

import java.util.Arrays;
import java.util.List;

public class Declaratii {

    public static void main(String[] args) {

        //declaratia unui numar te tip Integer
        int a = 10;

        //declaratia unei multimi de caractere
        char[] litere = new char[]{'a', 'b', 'c'};

        //declaratia unei liste
        List<String> judete = Arrays.asList("Timisoara", "Bihor", "Maramures");

    }

    /**
     * Crearea unui mesaj cu un bloc conditional
     * de tipul switch() case()
     * */
    public String origineProdus(String tara) {
        switch (tara) {
            case "ROMANIA":
                return "produs in Romania";
            case "ELVETIA":
                return "produs in Elvetia";
            default:
                return "Tara de origine necunoscuta";
        }
    }
}
