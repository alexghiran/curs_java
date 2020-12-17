package ro.trc.ziua2.expresiiConditionale;

import org.junit.jupiter.api.Test;

public class ExpresiiTest {

    private final String luni = "luni";
    private final String marti = "marti";
    private final String miercuri = "miercuri";
    final String prefix = "Am primit ca parametru ziua de ";

    enum ZileleSaptamanii {
        LUNI("luni", "matematica, programare, citit"),
        MARTI("marti", "java, bere"),
        MIERCURI("miercuri", "java, citit"),
        JOI("joi", "java, alergare");

        private final String prefix = "Activitatile din ziua ";
        private final String activati;
        private final String ziua;

        ZileleSaptamanii(String valoareZi, String valoareActivitati) {
            activati = valoareActivitati;
            ziua = valoareZi;
        }

        public String activitati() {
            return prefix + ziua + " :" + activati;
        }
    }


    @Test
    public void decizieZileTestIf() {
        decizieZileIf("Luni");
        decizieZileIf("marTi ");
        decizieZileIf(" miercuri ");
        decizieZileIf(" joi ");
    }

    @Test
    public void decizieZileTestSwitch() {
        decizieZileSwitch(" luni ");
        decizieZileSwitch(" Marti ");
        decizieZileSwitch(" MiercUri");
        decizieZileSwitch(" joi");

    }

    @Test
    public void decizieZileTestSwitchEnum() {
        decizieZileEnum(ZileleSaptamanii.LUNI);
        decizieZileEnum(ZileleSaptamanii.MARTI);
        decizieZileEnum(ZileleSaptamanii.MIERCURI);
        decizieZileEnum(ZileleSaptamanii.JOI);
    }

    /**
     * vrem sa scriem in consola un mesaj diferit
     * in functie de ziua pe care o primim ca parametru
     */
    private void decizieZileIf(String ziua) {
        if (ziua.trim().toLowerCase().equals(luni)) {
            System.out.println(prefix + luni);
        } else if (ziua.trim().toLowerCase().equals(marti)) {
            System.out.println(prefix + marti);
        } else if (ziua.trim().toLowerCase().equals(miercuri)) {
            System.out.println(prefix + miercuri);
        } else {
            System.out.println("Nicio activitate pentru ziua din parametru");
        }
    }

    private void decizieZileSwitch(String ziua) {
        switch (ziua.trim().toLowerCase()) {
            case luni:
                System.out.println(prefix + luni);
                break;
            case marti:
                System.out.println(prefix + marti);
                break;
            case miercuri:
                System.out.println(prefix + miercuri);
                break;
            default:
                System.out.println("Nicio activitate pentru ziua din parametru");
                break;
        }
    }

    private void decizieZileEnum(ZileleSaptamanii ziua) {
        switch (ziua) {
            case LUNI:
            case MARTI:
            case MIERCURI:
                System.out.println(ziua.activitati());
                break;
            default:
                System.out.println("Nicio activitate pentru ziua din parametru");
                break;
        }
    }
}
