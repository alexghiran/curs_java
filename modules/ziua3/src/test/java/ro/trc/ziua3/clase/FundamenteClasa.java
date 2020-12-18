package ro.trc.ziua3.clase;


import java.util.logging.Logger;

public class FundamenteClasa {

    private static final Logger logger = Logger.getLogger(FundamenteClasa.class.getName());

    private static int counter = 1;

    //http://aplicatia-noastra.ro/help

    public FundamenteClasa() {

        logger.severe(MesajeEroare.MESAJ_LOG_SEVERE);
        logger.warning(MesajeEroare.MESAJ_LOG_WARNING);
        logger.info(MesajeEroare.MESAJ_LOG_INFO);
        logger.config(MesajeEroare.MESAJ_LOG_CONFIG);

        counter++;
    }

    public String caracteristica;
    public static String denumire = "DENUMIREA CLASEI";

    public void actiuneInteresanta() {

    }

    public int numarulInstanteiCurente() {
        return counter;
    }

    public int numarInstante() {
        return counter - 1;
    }

    /**
     * 0 TRACE (FINEST)   => pentru dezvoltare
     * 1 DEBUG (FINE)     => pentru dezvoltare + mediul de testare
     * 2 INFO             => mesaje standard
     * 3 WARN             => mesaje warning (mesaje de configurare gresita dar care nu impiedica executia)
     * 4 ERROR            => nu am putut sa luam cererile => iesim (trimitem mesaj eroare catre user)
     */

    private void accesLaBazaDeDate() {

    }

    private void getRecords(int size) {
        if (size > 100_000) {
            logger.warning("Am primit un numar mare de valori " + size);
        }
    }

    /**
     * mediu dev
     *
     * mediu test
     *
     * mediu productie
     *
     *
     * */
}
