package ro.trc.ziua3.clase;

import org.junit.jupiter.api.Test;
import sun.tools.jconsole.Tab;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMostenire {

    /**
     * Se lucreaza cu array de principiu atunci cand se cunoaste dimensiunea
     * inaintea procesarii / popularii
     */
    private Tablou[] adunaTablouri() {
        Tablou[] adunate = new Tablou[2];
        Tablou dimineataDeVineri = new Tablou(
                "dimineata de vineri",
                new Artist("Simion", LocalDate.of(1975, Month.FEBRUARY, 10)),
                LocalDate.now()
        );

        Tablou vedereInBucatarie = new Tablou(
                "vedere in bucatarie",
                new Artist("Laurentiu", LocalDate.MIN),
                LocalDate.MAX

        );

        adunate[0] = dimineataDeVineri;
        adunate[1] = vedereInBucatarie;

        return adunate;
    }

    @Test
    public void testMostenireComparativ() {

        Tablou[] tablouriAdunate = adunaTablouri();

        //gratie idea :)
//        List<Tablou> tablouri = new ArrayList<>(Arrays.asList(tablouriAdunate));

        List<Tablou> tablouri = new ArrayList<>();
        tablouri.add(tablouriAdunate[0]);
        tablouri.add(tablouriAdunate[1]);


        for (Tablou tablou : tablouri) {
            System.out.println("Tabloul " + tablou.getDenumire().toUpperCase() +
                    " pictat de " + tablou.getArtist().getNume());
        }
    }

    @Test
    public void testArrayReaCredinta() {
        Tablou[] tablouriAdunate = adunaTablouri();
//        List<Tablou> listaReaTablouri = new ArrayListCurs<>(Arrays.asList(tablouriAdunate));

        List<Tablou> listaReaTablouri = new ArrayListCurs<>();
        listaReaTablouri.add(tablouriAdunate[0]);
        listaReaTablouri.add(tablouriAdunate[1]);

        for (Tablou tablou : listaReaTablouri) {
            System.out.println(tablou);
        }
    }


}
