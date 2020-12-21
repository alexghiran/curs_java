package ro.trc.ziua4.domeniu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Am terminat cu entitatea profesor
 */
public class Profesor extends Persoana {

    private Integer aniExperienta;
    private List<Asistent> listaAsistenti = new ArrayList<>();

    public Profesor(Integer id, String nume, String prenume, LocalDate dataNasteii, Integer aniExperienta) {
        super(id, nume, prenume, dataNasteii);
        this.aniExperienta = aniExperienta;
    }

    public Integer getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(Integer aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    public void addAsistent(Asistent valoare) {
        listaAsistenti.add(valoare);
    }

    public List<Asistent> getListaAsistenti() {
        return listaAsistenti;
    }

}
