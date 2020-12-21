package ro.trc.ziua3.recapitulare;

import org.junit.jupiter.api.Test;

public class ConcatenareString {
    @Test
    public void concateneaza() {
        String a = "ABC"; //refera o adresa din memorie cu valoarea ABC
        String b = "abc";

        String x = "ABC";

        String c = b.toUpperCase(); //refera o adresa DIFERITA din memorie cu valoarea ABC

        StringBuilder sb = new StringBuilder();
        if (a.equals(c)) {
            sb.append("Valoarea [")
                    .append(a)
                    .append("] este egala cu valoarea [")
                    .append(c)
                    .append("]");
            System.out.println(sb.toString());
//            System.out.println("Valoarea [" + a + "] este egala cu valoarea [" + c + "]");
        } else {
            System.out.println("Valoarea [" + a + "] NU este egala cu valoarea [" + c + "]");
        }
    }
}

/**
 * System.out.println("Valoarea [" + a + "] este egala cu valoarea [" + c + "]");
 * <p>
 * 1. "Valoarea ["
 * 2. "Valoarea [" + a
 * 3. "Valoarea [" + a + "] este egala cu valoarea ["
 * 4. "Valoarea [" + a + "] este egala cu valoarea [" + c +
 * 5. "Valoarea [" + a + "] este egala cu valoarea [" + c + "]"
 */
