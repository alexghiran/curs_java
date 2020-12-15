package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

public class Exceptions {
    @Test
    public void handleTryCatch() {
        int viteza = 60;
        int distanta = 120;
        int durata = 0;
        try {
            durata = divide(distanta, viteza);
            System.out.println("Durata totala este de "+ durata + " ore");
        } catch (Exception e) {
            //aici urmeaza sa fie tratata exceptia;
            System.out.println("Exceptie la rularea programului");

        }

        //avand in vedere ca blocul catch trateaza exceptia
        //(in cazul de fata logheaza eroarea) executia programului
        //ajunge in acest punct.
        trimiteDurataSpreClient(durata);
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private void trimiteDurataSpreClient(int durata) {
        //deschide/reutilizeaza conexiunea spre client
        //si trimite informatia
    }
}
