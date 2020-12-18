package ro.trc.ziua3.clase.liste;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaFructe {

    public static List<Fruct> toateFructele() {
        Fruct f1 = new Fruct(10, "Mar");
        Fruct f2 = new Fruct(2, "Para");
        Fruct f3 = new Fruct(3, "Portocala");
        Fruct f4 = new Fruct(4, "Avocado");
        Fruct f5 = new Fruct(5, "Pepene");
        Fruct f6 = new Fruct(6, "Pruna");
        Fruct f7 = new Fruct(7, "Mango");
        Fruct f8 = new Fruct(8, "Kaki");
        Fruct f9 = new Fruct(9, "Kaki");

        return Arrays.asList(f1, f2, f3, f4, f5, f6, f7, f8, f9);
    }


    @Test
    public void listaFructe() {

        List<Fruct> fructe = ListaFructe.toateFructele();

        //filtram fructele care incep cu p - metoda traditionala
        List<Fruct> rezultat = new ArrayList<>();
        int counter = 0;
        do {
            Fruct fruct = fructe.get(counter);
            if (fruct.getNume().toLowerCase().charAt(0) == 'p') {
                rezultat.add(fruct);
            }
            counter++;
        } while (counter < fructe.size());


        rezultat.forEach(System.out::println);

        separator();

        //filtram fructele care incept cu p - metoda moderna

        List<Fruct> incepCuP = fructe.stream()
                .filter(FiltreFructe::incepeCuP)
                .collect(Collectors.toList());

        incepCuP.forEach(System.out::println);

        separator();


        List<Fruct> incepeCuM = fructe.stream()
                .filter(FiltreFructe::incepeCuM)
                .collect(Collectors.toList());

        incepeCuM.forEach(System.out::println);

        separator();

        List<Fruct> incepeCuA = fructe.stream()
                .filter(FiltreFructe::incepeCuA)
                .collect(Collectors.toList());

        incepeCuA.forEach(System.out::println);
    }

    private void separator() {
        System.out.println("=".repeat(20));
    }

}
