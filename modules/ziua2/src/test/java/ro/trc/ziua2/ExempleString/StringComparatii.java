package ro.trc.ziua2.ExempleString;

import org.junit.jupiter.api.Test;

public class StringComparatii {
    @Test
    public void comparatieString() {
        String a = "abc";
        String b = "abc";

        System.out.println(a.compareTo(b));


    }

    /*
    * abc       => [a, b, b] => 3
    * abce       => [a,b, d, e] => 4
    *
    * */
}
