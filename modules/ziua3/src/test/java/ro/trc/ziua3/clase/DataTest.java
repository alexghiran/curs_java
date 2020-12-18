package ro.trc.ziua3.clase;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DataTest {
    @Test
    public void domeniuData() {
        System.out.println("Data minima in JDK este " + LocalDate.MIN);
        System.out.println("Data maxima in JDK este " + LocalDate.MAX);
    }
}
