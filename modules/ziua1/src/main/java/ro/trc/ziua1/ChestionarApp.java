package ro.trc.ziua1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChestionarApp {

    private final Pattern INTREBARE_PATTERN = Pattern.compile("\\d+(?=\\.text)");
    private final Pattern OPTIUNE_PATTERN = Pattern.compile("\\d+(?=\\.optiuni)");
    private final Pattern RASPUNS_PATTERN = Pattern.compile("\\d+(?=\\.raspuns)");

    private final int NUMAR_MAXIM_INCERCARI = 3;
    private static int NUMAR_INCERCARI = 1;

    /*
     * lista completa a intrebarilor
     * */
    private final Map<Integer, String> INTREBARI = new TreeMap<>();

    /*
     * lista completa a optiunilor
     * */
    private final Map<Integer, String[]> OPTIUNI = new TreeMap<>();

    /*
     * lista completa a raspunsurilor configurate
     * */
    private final Map<Integer, Integer> RASPUNSURI = new TreeMap<>();

    /*
     * vom tine raspunsurile validate introduse de utilizator
     * */
    private final Map<Integer, Boolean> RASPUNSURI_VALIDATE = new TreeMap<>();

    /**
     * <p>
     * Rutina principala de executie a programului.
     * </p>
     */
    public void executa(Properties properties) {

        this.loadIntrebari(properties);
        Set<Map.Entry<Integer, String>> setIntrebari = this.INTREBARI.entrySet();
        int indexIntrebare;

        /*
         * pentru fiecare intrebare din centralizator se afiseaza intrebarea,
         * se afiseaza optiunile de raspuns, se asteapta, se valideaza si se
         * inregistreaza raspunsul utilizatorului.
         *
         * */
        for (Map.Entry<Integer, String> grupIntrebare : setIntrebari) {
            indexIntrebare = grupIntrebare.getKey();

            //afiseaza intrebarea
            this.afiseazaIntrebare(grupIntrebare);

            //afiseaza optiunile
            this.afiseazaOptiuni(indexIntrebare);

            //asteapta raspunsul de la utilizator
            int raspuns = this.asteaptaRaspuns(indexIntrebare);

            //se verifica raspunsul
            this.verificaSiAdaugaRaspuns(indexIntrebare, raspuns);
        }

        //se afiseaza punctajul
        afiseazaPunctaj();

        //se afiseaza intrebarile la
        //care s-a raspuns gresit
        afiseazaRaspunsuriGresite();
    }

    /**
     * Afiseaza punctajul obtinut la test
     */
    private void afiseazaPunctaj() {
        int raspunsuriTotal, raspunsuriCorecte, raspunsuriGresite;
        raspunsuriTotal = RASPUNSURI_VALIDATE.size();
        raspunsuriCorecte = (int) RASPUNSURI_VALIDATE.entrySet().stream().filter(Map.Entry::getValue).count();

        afiseaza("======================");
        afiseaza(String.format("Punctaj obtinut: %d din %d", raspunsuriCorecte, raspunsuriTotal));
        afiseaza(String.format("Procentaj: %.2f", calculeazaProcent(raspunsuriCorecte, raspunsuriTotal)));
        afiseaza("======================");
    }

    /**
     * Calculeaza procentul raspunsurilor corecte
     */
    private double calculeazaProcent(double corecte, double total) {
        return corecte * 100 / total;
    }

    private void afiseazaRaspunsuriGresite() {
        StringBuilder raspunsuriGresite = new StringBuilder("Raspunsuri gresite: ").append(System.lineSeparator());
        int indexIntrebare = 0;
        boolean areRaspunsuriGresite = false;
        for (Map.Entry<Integer, Boolean> raspuns : RASPUNSURI_VALIDATE.entrySet()) {
            if (!raspuns.getValue()) {
                indexIntrebare = raspuns.getKey();
                raspunsuriGresite.append("Intrebarea ").append(indexIntrebare).append(", ")
                        .append("raspuns corect ").append(RASPUNSURI.get(indexIntrebare))
                        .append(System.lineSeparator());
                areRaspunsuriGresite = true;
            }
        }

        if (areRaspunsuriGresite) {
            afiseaza(raspunsuriGresite.toString());
        } else {
            afiseaza("Nicun raspuns gresit!");
        }
    }

    /**
     * verifica raspunsul de la utilizator si il adauga in centralizatorul
     * de raspunsuri
     */
    private void verificaSiAdaugaRaspuns(int indexIntrebare, int raspuns) {
        int variantaCorecta = this.RASPUNSURI.get(indexIntrebare);
        RASPUNSURI_VALIDATE.put(indexIntrebare, variantaCorecta == raspuns);
    }

    /**
     * rutina de asteptare si validare a raspunsului de la utilizator.
     * Procedura ruleaza pana cand unul din evenimente se intampla:
     * a) raspunsul primit este corect
     * b) se depaseste limita de raspunsuri gresite iar aplicatia
     * se opreste.
     */
    private int asteaptaRaspuns(int indexIntrebare) {
        int raspuns;

        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                raspuns = in.nextInt();

                if (raspunsCorect(indexIntrebare, raspuns)) {
                    reseteazaNumarIncercari();
                    break;
                } else {
                    if (NUMAR_INCERCARI < NUMAR_MAXIM_INCERCARI) {
                        afiseaza("Optiunea introdusa nu exista. Incercati inca odata.");
                        adaugaIncercareGresita();
                    } else {
                        iesireCuAvertisment();
                    }
                }
            } catch (InputMismatchException ex) {
                if (NUMAR_INCERCARI < NUMAR_MAXIM_INCERCARI) {
                    afiseaza("Va rugam sa raspundeti cu cifra asociata optiunii corecte");
                    adaugaIncercareGresita();
                } else {
                    iesireCuAvertisment();
                }
            }
        }


        return raspuns;
    }

    /**
     * Initializarea aplicatiei in care sint incarcatate proprietatile
     * din fisierul resursa, respectiv:
     * a) intrebarile
     * b) optiunile de raspuns pentru fiecare intrebare
     * c) raspunsurile corecte pentru fiecare intrebare
     */
    private void loadIntrebari(Properties proprietati) {
        Matcher matcher;
        int index;

        Set<String> titluri = proprietati.stringPropertyNames();
        for (String proprietate : titluri) {
            if ((matcher = INTREBARE_PATTERN.matcher(proprietate)).find()) {
                index = Integer.parseInt(matcher.group());
                INTREBARI.put(index, proprietati.getProperty(proprietate));
            } else if ((matcher = OPTIUNE_PATTERN.matcher(proprietate)).find()) {
                index = Integer.parseInt(matcher.group());
                OPTIUNI.put(index, proprietati.getProperty(proprietate).split(","));
            } else if ((matcher = RASPUNS_PATTERN.matcher(proprietate)).find()) {
                index = Integer.parseInt(matcher.group());
                RASPUNSURI.put(index, Integer.valueOf(proprietati.getProperty(proprietate)));
            }
        }
    }

    /**
     * Afiseaza intrebarea pe ecran pentru utilizator
     */
    private void afiseazaIntrebare(Map.Entry<Integer, String> grupIntrebare) {
        String textIntrebare = grupIntrebare.getValue();
        String result = "Intrebarea" + " " + grupIntrebare.getKey() + ":" + textIntrebare;
        this.afiseaza(result);
    }

    /**
     * Afiseaza optiunile de raspuns pentru utilizator
     */
    private void afiseazaOptiuni(int indexIntrebare) {
        String[] optiuni = this.OPTIUNI.get(indexIntrebare);
        StringBuilder textRaspunsuri = new StringBuilder("Optiuni: ");
        int counter = 1;
        for (String optiune : optiuni) {
            textRaspunsuri.append(counter++).append(")").append(optiune.trim()).append(" ");
        }

        this.afiseaza(textRaspunsuri.toString());
    }

    /**
     * Verifica daca raspunsul primit de la utilizator este corect
     */
    private boolean raspunsCorect(int indexIntrebare, int raspuns) {
        return raspuns > 0 && OPTIUNI.get(indexIntrebare).length >= raspuns;
    }


    /**
     * Metoda care intrerupe programul si care este apelata atunci
     * cand se depaseste numarul de erori.
     */
    private void iesireCuAvertisment() {
        afiseaza("Prea multe incercari gresite; Aplicatia se va inchide. Va rugam" +
                "sa incepeti o noua sesiune.");
        System.exit(-1);
    }

    /**
     * Se reseteaza numarul de erori pentru intrebarile urmatoare
     */
    private void reseteazaNumarIncercari() {
        NUMAR_INCERCARI = 1;
    }

    /**
     * Se incrementeaza numarul de incercari gresite
     */
    private void adaugaIncercareGresita() {
        NUMAR_INCERCARI++;
    }

    /**
     * Afiseaza un mesaj pe consola utilizatorului
     */
    private void afiseaza(String value) {
        System.out.println(value);
    }


}
