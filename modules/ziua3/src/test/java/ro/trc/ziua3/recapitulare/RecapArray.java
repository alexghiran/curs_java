package ro.trc.ziua3.recapitulare;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RecapArray {

    @Test
    public void testArray() {
        //un mod de initializare si populare
        //probabil cel mai compact
        String[] elemente = new String[]{"element 1", "element 2"};

        String[] elemente2 = new String[2];
        elemente2[0] = "element 1";
        elemente2[1] = "element 2";


        String[] elemente2Extins = new String[5];

        //copiem valorile din vechiul array in noul array
        for (int i = 0; i < elemente.length; i++) {
            elemente2Extins[i] = elemente[i];
        }

        printArray(elemente2Extins);
    }

    @Test
    public void testListe() {
        List<String> elemente = new ArrayList<>();
        elemente.add("Element 1");
        elemente.add("Element 2");
        elemente.forEach(System.out::println);

        System.out.println("=".repeat(10));

        elemente.add("Element 3");
        elemente.forEach(System.out::println);
    }

    private void printArray(String[] array) {
        for (String value : array) {
            System.out.println(value);
        }
    }

    /*
     * array initial -> [1][2] -> [3]???
     *
     * array nou     -> [ ][ ][ ][ ]
     *
     *
     * */
}
