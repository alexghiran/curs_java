package ro.trc.ziua4.domeniu;

import java.time.LocalDate;

public class Asistent extends Persoana {
    private String catedra;

    public Asistent(Integer id, String nume, String prenume, LocalDate dataNasteii, String catedra) {
        super(id, nume, prenume, dataNasteii);
        this.catedra = catedra;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
}
