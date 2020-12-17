package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

import java.util.BitSet;
import java.util.Random;

public class DeclaratiiJavaTest {

    /**
     * generator de id-uri fara sa existe
     * cerinta pe moment ca el sa fie unic
     */
    private NumarPropriu genereaza() {
        return new NumarPropriu(new Random().nextInt(999), "abc");
    }


    @Test
    public void testDeclaratii() {

    }

    @Test
    public void testChar() {
        char c = 'c';
        /**
         * 16 bits  = 2 bytes
         * 8 bits = 1 byte
         * */
    }

    @Test
    public void testInteger() {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    /**
     * Comunicatia intre server si aplicatia client se face prin apeluri rest (json)
     *
     *
     * */

    /**
     * Caracteristica numerelor primitive
     *
     * tipurile primitive din java sunt caracterizate de faptul
     * ca au un domeniu prestabilit de valori
     * */

    /**
     * reprezentare grafica a unui byte
     * 00000000 -> 0 valoarea minima
     * 11111111 -> 255
     *
     * in total sunt 256 de valori
     *
     * 1 byte = 8 biti
     *
     * */
}
