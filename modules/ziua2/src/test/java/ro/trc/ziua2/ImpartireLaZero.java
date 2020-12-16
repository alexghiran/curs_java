package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

public class ImpartireLaZero {

    /**
     * <p>
     * Tip comentariu 1
     * Exemplu de exceptie pentru impartirea la 0
     * </p>
     */
    @Test
    public void ceSeIntamplaDacaImpartLaZero() {
        int numarA = 10;
        int numarB = 0;
        int rezultat = numarA / numarB;

        System.out.println("Am terminat de rulat");
    }

    /*
     * tip comentariu 2
     * tip de comentariu specific metodelor / variabilelor
     * interne unei clase
     *
     * //todo: adauga validare la citirea fisierului
     * */
    private void comentariuDeTip2() {

    }

    //nu se foloseste niciodata deasupra metodei
    private void comentariuDeTip3() {

        //acelasi monitor pentru lock
        Object monitor = new Object();

        //se conecteaza la baza de date
        newConexiuneLaBazaDeDate();

    }

    private void newConexiuneLaBazaDeDate() {
        //aici se conecteaza
    }

}
