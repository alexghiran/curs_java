package ro.trc.ziua1;

import org.junit.jupiter.api.Test;

public class IndexActivitatiZilniceTest {
    @Test
    public void testIndexActivitate() {
        IndexActivitatiZilnice index = new IndexActivitatiZilnice();
        int indexActivitateMatematica = index.numarOrdineActivitate("luni", "activitate 4");

        System.out.println("Indexul pentru matematica este: " + indexActivitateMatematica);
    }
}
