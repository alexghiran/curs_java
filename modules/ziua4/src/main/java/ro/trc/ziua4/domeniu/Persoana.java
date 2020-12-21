package ro.trc.ziua4.domeniu;

import java.time.LocalDate;

public abstract class Persoana {
    private Integer id;
    private String nume;
    private String prenume;
    private LocalDate dataNasteii;

    public Persoana(Integer id, String nume, String prenume, LocalDate dataNasteii) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasteii = dataNasteii;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public LocalDate getDataNasteii() {
        return dataNasteii;
    }

    public void setDataNasteii(LocalDate dataNasteii) {
        this.dataNasteii = dataNasteii;
    }
}
