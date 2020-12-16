package ro.trc.ziua1;

import java.time.LocalDateTime;

public class ExempluConstructor {

    private String nume;
    private LocalDateTime timestamp;

    private static int COUNTER = 0;

    /**
     * constructor implicit
     */
    public ExempluConstructor() {
        COUNTER++;
    }

    public ExempluConstructor(String a, LocalDateTime b) {
        nume = a;
        timestamp = b;
    }

    public String cineSunt() {
        return this.toString() + " -> " + this.getClass() + " counter = " + COUNTER;
    }

    public static void main(String[] args) {
        ExempluConstructor constructor;
        for (int i = 0; i < 10; i++) {
            constructor = new ExempluConstructor();
            System.out.println(constructor.cineSunt());
        }
    }
}

/**
 * Notiunea de clasa -> definitie
 * new() => instanta a clasei
 */
