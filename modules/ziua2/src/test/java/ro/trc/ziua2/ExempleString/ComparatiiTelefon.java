package ro.trc.ziua2.ExempleString;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatiiTelefon {
    @Test
    public void comparaTelefoane() {
        Telefon telefonA = new Telefon(2020, "Samsung", LocalDate.of(2020, Month.JANUARY, 10), "negru", 130.80);
        Telefon telefonB = new Telefon(2019, "Huawei", LocalDate.of(2019, Month.SEPTEMBER, 15), "argintiu", 85.40);
        Telefon telefonC = new Telefon(2018, "Xiaomi", LocalDate.of(2018, Month.SEPTEMBER, 15), "argintiu", 85.40);
        Telefon telefonD = new Telefon(2021, "Nokia", LocalDate.of(2021, Month.SEPTEMBER, 15), "argintiu", 180.40);
        Telefon telefonE = new Telefon(2015, "AllView", LocalDate.of(2015, Month.SEPTEMBER, 15), "argintiu", 99.99);

        List<Telefon> telefonList = new ArrayList<>();
        telefonList.add(telefonA);
        telefonList.add(telefonB);
        telefonList.add(telefonC);
        telefonList.add(telefonD);
        telefonList.add(telefonE);

        List<Telefon> listaTelofoane = Arrays.asList(telefonA, telefonB, telefonC, telefonD, telefonE);
        Collections.sort(listaTelofoane);

        for (Telefon telefon : telefonList) {
            System.out.println(telefon);
        }

    }
}
