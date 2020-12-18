package ro.trc.ziua3.clase;

/**
 * variabele unei clase trebuie accesate doar prin metode
 * (atunci cand apelul se face din afara ariei de increde).
 */
public abstract class Cheie {
    protected int lungime;
    private String producator;

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        if (lungime > 10) {
            throw new IllegalArgumentException("valoarea e mult prea mare");
        }
        this.lungime = lungime;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }
}
