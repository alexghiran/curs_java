package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class TesteZiua2 {
    @Test
    public void binar() {
        convertToBinary(new Random().nextInt(16));
    }


    private void convertToBinary(final int valoare) {
        int initial = valoare;
        StringBuilder rezulatBinar = new StringBuilder();
        do {
            switch (valoare % 2) {
                case 0:
                    rezulatBinar.insert(0, '0');
                    break;
                case 1:
                    rezulatBinar.insert(0, '1');
                    break;
            }
            initial >>= 1;
        } while (initial > 0);

        System.out.println("Reprezentarea binara a numarului " +
                valoare + " este: " + rezulatBinar.toString());

        System.out.println(this.literal());
    }

    /**
     * metoda returneaza un obiect de tip string
     * creat dintr-un string literal
     * */
    public String literal() {
        return "Acesta este un string literal; java va prelua acest" +
                "text si il va asocia unui obiect de tip String" +
                "care va fi returnat din aceasta functie";
    }

    @Test
    public void testImmutablity() {
        this.immutability();
    }


    /**
     * Metodele care aparent modifica un String, in fapt
     * creaza unul nou. In exemplul de mai jos rezultatul
     * metodei textCuSpatii.trim() este ignorat deoarece
     * nu este atribuit niciunei variabile. ca urmare,
     * afisarea a 2-a oara a variabilei textCuSpatii va
     * fi identica cu prima.$
     * */
    private void immutability() {
        String textCuSpatii = "           java strings";
        System.out.println(textCuSpatii);
        textCuSpatii.trim();
        System.out.println(textCuSpatii);

        String textCorectat = textCuSpatii.trim();
        System.out.println(textCorectat);
    }
}
