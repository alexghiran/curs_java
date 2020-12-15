package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

public class FinallyExample {

    @Test
    public void comunicaCuBazaDeDate() {
        try{
            deschideConexiuneLaBazaDeDate();
            ruleazaProceduriInBazaDeDate();

            proceseazaRezultate();

        }catch (Exception e) {
            System.out.println("A intervenit o eroare");
        }finally {
            //blocul finally se executa intotdeauna
            if(conexiuneDeschisa()) {
                inchideConexiunea();
            }
        }

    }

    private void inchideConexiunea() {
        //declaratii pentru inchiderea conexiunii
    }

    private boolean conexiuneDeschisa() {
        //verifica daca conexiunea este deschisa;
        return true;
    }

    private void proceseazaRezultate() {
        //proceseaza rezultatele din baza de date
    }

    private void ruleazaProceduriInBazaDeDate() {
        //ruleaza proceduri in baza de date (select, insert, update, proceduri stocate, etc)
    }

    private void deschideConexiuneLaBazaDeDate() {
        //deschide conexiunea la baza de date
    }
}
