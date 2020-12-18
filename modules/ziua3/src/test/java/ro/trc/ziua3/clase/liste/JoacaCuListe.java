package ro.trc.ziua3.clase.liste;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class JoacaCuListe {

    /*
     * Java7 => Java8, o lume noua
     * */

    @Test
    public void joacaCuListe() {

        //modul traditional de a scrie cod
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        separator();

        //modul modern de a scrie cod
        IntStream.range(1, 10).forEach(System.out::println);

        separator();

        IntStream.range(1, 10).forEach(System.out::println);

    }

    private void separator() {
        System.out.println("=".repeat(30));

    }

    // array => String[]
    // liste => List<String>

    //Streams => programari cu apeluri fluente
}
