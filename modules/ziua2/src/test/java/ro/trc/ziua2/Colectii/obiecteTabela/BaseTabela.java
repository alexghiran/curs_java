package ro.trc.ziua2.Colectii.obiecteTabela;

import java.time.LocalDate;

/**
 * Clasa de baza pentru designul nostru mic
 * de tabela si tabela istoric. In clasa de baza
 * am inclus campurile comune.
 */
public abstract class BaseTabela {
    private String denumire;
    private String nume;
    private String prenume;
    private LocalDate dataNasterii;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
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

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }
}
