package ro.trc.ziua2.expresiiLoop;

import org.junit.jupiter.api.Test;

public class LoopForTest {
    @Test
    public void testForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("abc");
        }

        System.out.println("=======");

        int i = 0;
        while (i < 10) {
            System.out.println("abc");
            i++;
        }
    }

    /**
     * loop pentru array, 6 variante
     * ultimele 2 nu le incercati :)
     *
     *
     * */
    @Test
    public void loopArrays() {
        //0, 1, 2, 3
        //dimensiunea este de 4
        String[] denumiri = new String[]{"abc", "cde", "xyz", "lop"};

        String[] denumiriAlternativ = new String[4];
        denumiriAlternativ[0]="sdad";
        denumiriAlternativ[1]="erer";
        denumiriAlternativ[2]="ed";
        denumiriAlternativ[3]="ad";

        System.out.println("========= Loop prin intermediul for");

        for (int i = 0; i < denumiri.length; i++) {
            System.out.println(denumiri[i]);
        }

        System.out.println("========= Loop prin intermediul for each");

        int pos = 0;
        for (String denumire : denumiri) {
            System.out.println(denumire + " -> la pozitia " + pos++);
        }

        System.out.println("========= Loop prin intermediul while");

        int posx = 0;
        while (posx < denumiri.length) {
            System.out.println(denumiri[posx] + " -> la pozitia " + posx++);
        }

        System.out.println("========= Loop prin intermediul do while");

        int posy = 0;
        do {
            System.out.println(denumiri[posy] + " -> la pozitia " + posy++);
        } while (posy < denumiri.length);

        System.out.println("========= Loop prin intermediul while(true)");

        int posz = 0;
        while (true) {
            System.out.println(denumiri[posz] + " -> la pozitia " + posz++);
            if (posz == denumiri.length) {
                break;
            }
        }

        System.out.println("========= Loop prin intermediul exceptiilor");

        int stop = 0;
        int posv = 0;
        while (true) {
            try {
                System.out.println(denumiri[posv] + " -> la pozitia " + posv++);
            } catch (ArrayIndexOutOfBoundsException ex) {
                break;
            }
        }
    }

    /**
     * int retries = 1;
     * try {
     *     conecteaza(adresaServer)
     * } catch(CannotConnectException ex) {
     *     if(retries++ < 5) {
     *         Thread.sleep(5000)
     *     } else {
     *          log.error("nu ne putem conecta la serviciu nici dupa 5 incercari")
     *         break;
     *     }
     *
     * }
     *
     *
     *
     *
     * */

}
