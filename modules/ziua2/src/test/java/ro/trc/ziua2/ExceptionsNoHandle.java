package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

public class ExceptionsNoHandle {

    /**
     * Exemplu de posibila exceptie netratata
     * <p>
     * Conventia de apel a programului este ca apelantul
     * sa transmita 2 parametri:
     * parametrul 1, de tip Integer, reprezinta distanta
     * parametrul 2, de tip Integer, reprezinta viteza
     */
    public static void main(String[] args) {
        int distanta = Integer.parseInt(args[0]);
        int viteza = Integer.parseInt(args[1]);

        //acordati putina atentie acestei constructii
        //avand in vedere ca suntem in interiorul unei metode statice
        //trebuie sa cream o instanta a clasei in care se afla
        //metoda imparte
        int durata = new ExceptionsNoHandle().imparte(distanta, viteza);


        transmiteDurataSpreClient(durata);
    }

    private int imparte(int distanta, int viteza) {
        return distanta / viteza;
    }

    private static void transmiteDurataSpreClient(int durata) {
        //transmite durata
    }

}
