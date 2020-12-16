package ro.trc.ziua1;

import java.time.LocalDate;

public class ApelStatic {

    public static void main(String[] args) {

        String argument1 = args[0];
        String argument2 = args[1];
        Integer argument3 = Integer.parseInt(args[2]);

        System.out.println("Argument 1 = " + argument1);
        System.out.println("Argument 2 = " + argument2);
        System.out.println("Argument 3 = " + argument3.toString());


        /*
         * Codul de mai jos nu se compileaza pentru ca masina virtuala
         * java nu permite accesul unei metode de instanta dintr-o metoda
         * statica.
         *
         * Intotdeauna trebuie creata instanta.
         * */
//        LocalDate dataCurenta = Miercuri.dataCurenta();

        /*
         * Varianta corecta de apel a unei metode de instanta dintr-o
         * metoda statica, prin instantiere
         * */
        LocalDate dataCurenta = new Miercuri().dataCurenta();

        System.out.println("=================");

        Miercuri miercuri = new Miercuri();
        System.out.println(miercuri);
    }


}
