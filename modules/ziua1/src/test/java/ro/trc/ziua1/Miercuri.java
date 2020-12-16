package ro.trc.ziua1;

import java.time.LocalDate;

public class Miercuri {

    private LocalDate dataCurenta;
    private String ziuaCurenta;

    public Miercuri() {
        dataCurenta = LocalDate.now();
        ziuaCurenta = "miercuri";
    }

    public LocalDate dataCurenta() {
        return dataCurenta;
    }

    @Override
    public String toString() {
        return "Astazi este miercuri in data de " + dataCurenta;
    }
}
