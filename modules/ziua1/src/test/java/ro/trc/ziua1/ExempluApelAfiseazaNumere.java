package ro.trc.ziua1;

import org.junit.jupiter.api.Test;

public class ExempluApelAfiseazaNumere {
    @Test
    public void apelAfiseazaNumere() throws Exception {
        ExempluMetoda exempluMetoda = new ExempluMetoda();
        int[] numere = new int[]{3, 4, 5, 6, 7, 8, 9};

        exempluMetoda.afiseazaNumere3(numere);
    }
}
