package ro.trc.ziua3.clase.liste;

public class Fruct {
    private int cod;
    private String nume;

    public Fruct(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return nume + " -> " + cod;
    }
}
