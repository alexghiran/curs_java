package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

public class Strings {

    @Test
    public void splitString() {
        String sirZileLucratoare = "Luni, Marti, Miercuri, Joi, Vineri";

        String[] zileLucratoare = sirZileLucratoare.split(",");
        String luni = zileLucratoare[0].trim();
        String marti = zileLucratoare[1].trim();
        String miercuri = zileLucratoare[2].trim();
        String joi = zileLucratoare[3].trim();
        String vineri = zileLucratoare[4].trim();

        zileLucratoare[5] = "sambata";

        System.out.println(luni);
        System.out.println(marti);
        System.out.println(miercuri);
        System.out.println(joi);
        System.out.println(vineri);
    }

    String extern = "abc";

    @Test
    public void compareWithEquals() {
        String abc = "abc";
        String neoptimizat = unStringNeoptimizatDeCompilator("abc     ");
        System.out.println(abc == neoptimizat ?
                "Nu sunt egale [" + abc + "] si [" + neoptimizat + "]" :
                "Nu sunt egale [" + abc + "] si [" + neoptimizat + "]");
    }

    private String unStringNeoptimizatDeCompilator(String value) {
        return value.trim();
    }

    @Test
    public void stringConcatenation() {
        Telefon telefon = new Telefon("Simerian", "VIB");
        Casca casca = new Casca("Wireless", 1240.80);

        if (compatibil(telefon, casca)) {
            System.out.println(telefon + " compatibil cu " + casca);
        }
    }

    static class Casca {
        private final String denumire;
        private final double pret;

        public Casca(String denumire, double pret) {
            this.denumire = denumire;
            this.pret = pret;
        }

        @Override
        public String toString() {
            return "casca " + denumire + " la pretul de " + pret;
        }
    }

    static class Telefon {
        private final String marca;
        private final String model;

        public Telefon(String marca, String model) {
            this.marca = marca;
            this.model = model;
        }

        @Override
        public String toString() {
            return "Telefon marca " + marca + " model " + model;
        }
    }

    private boolean compatibil(Telefon telefon, Casca casca) {
        return true;
    }
}
