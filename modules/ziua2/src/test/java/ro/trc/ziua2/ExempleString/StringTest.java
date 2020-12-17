package ro.trc.ziua2.ExempleString;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class StringTest {

    /**
     * orice obiect de tip String este imutabil.
     * Asta inseamna ca fiecare operatie pe care o facem pe un obiect
     * de tip String nu va afecta obiectul initial ci va crea un nou String
     */
    @Test
    public void testString() {
        String domeniu = new String(" programare ");
        System.out.println("Lungime initiala string: " + domeniu.length());

        domeniu = domeniu.trim();
        System.out.println("Lungime dupa trim: " + domeniu.length());

        /*daca un string are inceput egal cu*/
        boolean startsWith = domeniu.startsWith("pro");
        System.out.println(startsWith);

        /* afisam upper case*/
        System.out.println(domeniu.toUpperCase());

        String domeniuUpperCase = domeniu.toUpperCase();

        for (int i = 0; i < domeniuUpperCase.length(); i++) {
            System.out.println("caracter: " + domeniuUpperCase.charAt(i));
        }

        System.out.println(domeniu);
        //operatorul == folosit cu string
    }

    @Test
    public void testTelefonInformatii() {

        /*multe linii inaite
         * initializari
         * */

        Telefon telefon = new Telefon(2020, "Producator", LocalDate.of(2020, Month.MARCH, 10), "negru", 130.50);
        conecteazaTelefon(telefon);

        System.out.println(telefon);
    }


    private void conecteazaTelefon(Telefon telefon) {
        /*facem niste treburi cu telefonul*/

        System.out.println(telefon);
    }


}
