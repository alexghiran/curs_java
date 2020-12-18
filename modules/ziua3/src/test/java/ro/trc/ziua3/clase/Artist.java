package ro.trc.ziua3.clase;

import java.time.LocalDate;

/**
 * Reprezinta clasa artist pentru un tablou sau alta categorie de obiecte similare
 */
public class Artist {
    private String nume;
    private LocalDate dataNasterii;

    public Artist(String nume, LocalDate dataNasterii) {
        this.nume = nume;
        this.dataNasterii = dataNasterii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }
}
