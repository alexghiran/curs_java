package ro.trc.ziua2.expresiiBoolean;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class ConditiiOrAnd {
    @Test
    public void conditiiOrAnd() {
        int numarA = 0;
        int numarB = 0;

//        while ((numarA = genereazaNumar(99)) < 80 || ((numarB = genereazaNumar(99)) < 80)) {
//            System.out.println("am generat " + numarA + " si " + numarB);
//        }


        int counter = 0;
        while (true) {
            numarA = genereazaNumar(99);
            if (numarA < 80 || (numarB = genereazaNumar(99)) < 80) {
                System.out.println("Conditie true, valori: " + numarA + " si " + numarB);
                numarB = 0;
            } else {
                System.out.println("Conditie false, valori: " + numarA + " si " + numarB);
                numarB = 0;
            }

            if (counter++ > 100) {
                break;
            }
        }

        /*
        *
        * 0 | 0 = 0
        * 0 | 1 = 1
        * 1 | 0 = 1
        * 1 | 1 = 1
        *
        * */

    }

    private int genereazaNumar(int range) {
        return new Random().nextInt(range);
    }


    /**
     * if(a || b) {
     *
     * }
     *
     * a || b => daca a este fals raspunsul este fals
     *
     *
     * */
}
