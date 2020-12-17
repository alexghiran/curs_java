package ro.trc.ziua2;

public class NumarPropriu {
    int numarulMeu;
    String sirCaractere;

    public NumarPropriu(int numarulMeu, String sirCaractere) {
        this.numarulMeu = numarulMeu;
        this.sirCaractere = sirCaractere;
    }

    public int getNumarulMeu() {
        return numarulMeu;
    }

    public void setNumarulMeu(int numarulMeu) {
        this.numarulMeu = numarulMeu;
    }

    public String getSirCaractere() {
        return sirCaractere;
    }

    public void setSirCaractere(String sirCaractere) {
        this.sirCaractere = sirCaractere;
    }

    @Override
    public String toString() {
        return sirCaractere + "-" + numarulMeu;
    }
}
