package ro.trc.ziua4.domeniu;

import java.time.LocalDate;

public class Student extends Persoana {

    private String grupa;

    public Student(Integer id, String nume, String prenume, LocalDate dataNasteii, String grupa) {
        super(id, nume, prenume, dataNasteii);
        this.grupa = grupa;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }
}
