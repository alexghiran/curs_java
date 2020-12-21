package ro.trc.ziua2.ExempleString;

import java.time.LocalDate;

public class Telefon implements Comparable<Telefon> {
    private int anulFabricatiei;
    private String producator;
    private LocalDate anulLansarii;
    private String culoare;
    private double pret;

    public Telefon(int anulFabricatiei, String producator, LocalDate anulLansarii, String culoare, double pret) {
        this.anulFabricatiei = anulFabricatiei;
        this.producator = producator;
        this.anulLansarii = anulLansarii;
        this.culoare = culoare;
        this.pret = pret;
    }

    public int getAnulFabricatiei() {
        return anulFabricatiei;
    }

    public void setAnulFabricatiei(int anulFabricatiei) {
        this.anulFabricatiei = anulFabricatiei;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public LocalDate getAnulLansarii() {
        return anulLansarii;
    }

    public void setAnulLansarii(LocalDate anulLansarii) {
        this.anulLansarii = anulLansarii;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("[producator ").append(producator).append("]")
                .append(" [anul fabricatiei ").append(anulFabricatiei).append("]")
                .append(" [culoare ").append(culoare).append(" ]")
                .append(" [anul lansarii ").append(anulLansarii).append(" ]")
                .append(" [pret ").append(pret).append(" ]");

        return result.toString();
    }

    @Override
    public int compareTo(Telefon o) {
//        System.out.println("urmeaza sa facem comparatia");

        if (this.pret - o.getPret() < 0) {
            return -1;
        } else if (this.pret == o.getPret()) {
            return 0;
        } else if(this.pret - o.getPret() > 0) {
            return 1;
        } else {
            throw new RuntimeException("nu are cum sa ajunga aici");
        }

//        return (this.pret - o.getPret() < 0) ?
//                -1 : (this.pret == o.getPret()) ? 0 : 1;
    }

    /*
        a + b + c + d + e
    *   a + b       => ab
    *   ab + c      => abc
        abc + d     => abcd
        abcd + e    => abcde;
    * */
}
