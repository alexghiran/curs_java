package ro.trc.ziua1;

import java.util.Properties;
import java.util.Set;

public class IndexActivitatiZilnice {

    private Properties properties;

    /**
     * Constructor implicit. Sunt incarcate proprietatile
     * in baza carora vom determina ordinea activitatilor
     */
    public IndexActivitatiZilnice() {
        properties = new Properties();
        try {
            properties.load(IndexActivitatiZilnice.class.getResourceAsStream("/zile.properties"));
        } catch (Exception e) {
            System.out.println("Exceptie la citirea fisierului de proprietati");
            System.exit(-1);
        }
    }

    public String getProprietate(String cod) {
        Object result = properties.get(cod);
        if (result instanceof String) {
            return (String) result;
        }

        //nu este o practica buna!
        throw new RuntimeException("Proprietate invalida");
    }

    /**
     * Returneaza indexul unei activitati dintr-o zi
     *
     * @param ziua               reprezinta ziua pentru care se doreste indexarea activitatii
     * @param denumireActivitate reprezinta denumirea activitatii
     * @return returneaza indexul activitatii
     */
    public int numarOrdineActivitate(String ziua, String denumireActivitate) {
        //iteram printre proprietati pana gasim proprietatea pentru ziua solicitata
        Set<Object> cheiProprietati = properties.keySet();
        String activitatiComplet;
        String[] activitati;
        for (Object cheie : cheiProprietati) {
            if (cheie instanceof String) {
                if (((String) cheie).contains(ziua)) {

                    //la punctul asta avem tot stringul;
                    //trebuie sa il impartim
                    activitatiComplet = properties.getProperty((String) cheie);
                    activitati = activitatiComplet.split(",");

                    //acum trebuie sa gasim indexul
                    //activatii cautate
                    for (int i = 0; i < activitati.length; i++) {
                        if (activitati[i].trim().toLowerCase().equals(denumireActivitate.trim().toLowerCase())) {
                            return i + 1;
                        }
                    }
                }
            }
        }
        return -1;
    }

}
