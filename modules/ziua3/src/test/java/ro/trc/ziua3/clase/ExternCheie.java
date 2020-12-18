package ro.trc.ziua3.clase;

import org.junit.jupiter.api.Test;

public class ExternCheie {
    @Test
    public void acceseazaVariabilaProtected() {
        CheieMasina cheieMasina = new CheieMasina();
        cheieMasina.lungime = 1_000;
    }
}
