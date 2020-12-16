package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

public class ImpartireLaZero {

    @Test
    public void ceSeIntamplaDacaImpartLaZero() {
        int numarA = 10;
        int numarB = 0;
        int rezultat = numarA / numarB;

        System.out.println("Am terminat de rulat");
    }
}
