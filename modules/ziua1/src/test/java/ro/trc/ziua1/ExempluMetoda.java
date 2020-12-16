package ro.trc.ziua1;

import org.junit.jupiter.api.Test;

import java.util.Properties;

public class ExempluMetoda {

    private static Properties proprietati = new Properties();

    static {
        try {
            proprietati.load(ExempluMetoda.class.getResourceAsStream("/afiseazaNumere.properties"));
        } catch (Exception e) {
            System.out.println("Exceptie la incarcarea fisierului de proprietati");
        }
    }

    @Test
    public void afiseaza3Numere() throws Exception {
        int[] numere = new int[3];
        numere[0] = 4;
        numere[1] = 5;
        numere[2] = 6;

        afiseazaNumere3(numere);
    }

    @Test
    public void citesteProprietati() {
        for (Object object : proprietati.keySet()) {
            if(object instanceof String){
                System.out.println(object);
            }
        }
    }


    @Test
    public void afiseaza2Numere() throws Exception {
        int[] numere = new int[]{7, 8};

        afiseazaNumere3(numere);
    }

    public void afiseazaNumere3(int[] sirNumere) throws Exception {
        for (int i = 0; i < sirNumere.length; i++) {
            String mesaj = extrageValoarea("afiseazaNumere.text");
            System.out.println(mesaj + sirNumere[i]);
        }
    }

    private String extrageValoarea(String cheie) {
        Object result = proprietati.get(cheie);
        if (result instanceof String) {
            return (String) result;
        } else {
            //nu ar trebui sa ajunga
        }

        return null;
    }

}
