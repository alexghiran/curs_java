package ro.trc.ziua3.recapitulare;

import org.junit.jupiter.api.Test;

public class Conditiional {

    boolean esteAdevarat = true;
    boolean esteNecesar = false;

    @Test
    public void itereaza() {
        if (esteAdevarat) {
            System.out.println("conditia este adevarata");
        } else {
            System.out.println("conditia nu este adevarata");
        }
    }

    @Test
    public void conditieInlantuita() {
        if (esteAdevarat && esteNecesar) {
            System.out.println("ambele conditii sunt adevarate");
        } else if (esteAdevarat || esteNecesar) {
            System.out.println("doar o conditie este adevatata");
        } else {
            System.out.println("nicio conditie nu este adevarata");
        }
    }

    enum Valori {
        VALOARE_1, VALOARE_2, VALOARE_3
    }

    private static final String valoare_1 = "Valoare_1";

    @Test
    public void conditieSwitch() {
        analizeazaValoare(Valori.VALOARE_2);
    }

    private void analizeazaValoare(Valori valoare) {
        switch (valoare) {
            case VALOARE_1:
            case VALOARE_2:
                System.out.println("am primit valoarea 1 sau valoarea 2");
                break;
            case VALOARE_3:
                System.out.println("am primit valoarea 3");
                break;
        }
    }

}
