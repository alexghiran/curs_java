package ro.trc.ziua4.repository;

import org.springframework.stereotype.Component;
import ro.trc.ziua4.domeniu.Asistent;
import ro.trc.ziua4.domeniu.Profesor;

import java.time.LocalDate;
import java.time.Month;

@Component
public class ProfesorRepository {

    /*
     * simulam o metoda din repository
     * */
    public Profesor getProfesorPrincipalFromDatabase() {
        //select * from profesor where isPrincipal = true
        Profesor principal = new Profesor(10, "Fratila", "Octavian", LocalDate.of(1980, Month.JUNE, 7), 24);
        Asistent asistent = new Asistent(14, "Dumitru", "Bogdan", LocalDate.of(1998, Month.AUGUST, 18), "Sisteme informatice");

        principal.addAsistent(asistent);

        return principal;
    }
}
