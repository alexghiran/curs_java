package ro.trc.ziua3.clase.liste;

/**
 * Clasa dedicata filtrelor pentru fructe
 */
public class FiltreFructe {

    public static boolean incepeCuP(Fruct fructul) {
        return incepeCu(fructul, 'p');
    }

    public static boolean incepeCuM(Fruct fructul) {
        return incepeCu(fructul, 'm');
    }

    public static boolean incepeCuA(Fruct fructul) {
        return incepeCu(fructul, 'a');
    }

    public static boolean incepeCu(Fruct fruct, char c) {
        return fruct.getNume().toLowerCase().charAt(0) == c;
    }

    public static boolean existaKaki(Fruct fructul) {
        return fructul.getNume().toLowerCase().equals("kaki");
    }
}
