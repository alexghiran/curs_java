package ro.trc.ziua2;

public class ExceptionWithHandles {

    /**
     * Exemplul din {@link ExceptionsNoHandle} insa cu
     * o parte din posibilele exceptii tratate
     * <p>
     * Scenariul la care raspunde este urmatorul:
     * Programul trebuie sa calculeze <b>viteza de deplasare</b> avand
     * ca parametri de intrare distanta si durata.
     * <p>
     * Viteza rezultata trebuie transmisa unei aplicatii externe.
     * In cazul in care apare o eroare de procesare a vitezei,
     * programul nu trebuie sa se intrerupa ci va transmite valoarea -1
     * care va fi tratata in aplicatia externa.
     */
    public static void main(String[] args) {
        final int VITEZA_IMPLICITA = -1;
        int durata, distanta;
        int viteza = VITEZA_IMPLICITA;
        try {
            distanta = Integer.parseInt(args[0]);
            durata = Integer.parseInt(args[1]);

            viteza = new ExceptionWithHandles().imparte(distanta, durata);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Numarul de argumente nu este bun");
        } catch (NumberFormatException ex) {
            System.out.println("Argumentele primite nu sunt numerice");
        } catch (CalculVitezaException e) {
            System.out.println("Valori incorecte pentru calculul vitezei");
        } catch (ArithmeticException e) {
            System.out.println("Impartirea la 0 nu poate fi realizata");
        }

        new ExceptionWithHandles().transmiteVitezaSpreAplicatieExterna(viteza);
    }

    private int imparte(int distanta, int durata) throws CalculVitezaException {
        if (durata < 1 && distanta < 1) {
            throw new CalculVitezaException("Valori invalide pentru calcul");
        }
        return distanta / durata;
    }

    private void transmiteVitezaSpreAplicatieExterna(int viteza) {
        System.out.println("Viteza a fost transmisa cu valoarea: " + viteza);
    }
}
