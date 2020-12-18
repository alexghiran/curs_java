package ro.trc.ziua3.clase.liste;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListaTransformari {
    @Test
    public void transformaFructe() {
        List<Fruct> fructe = ListaFructe.toateFructele();

        List<String> denumiri = fructe.stream()
                .map(this::transforma)
                .collect(Collectors.toList());

        denumiri.forEach(System.out::println);
    }

    @Test
    public void cauta() {
        List<Fruct> fructe = ListaFructe.toateFructele();

        boolean existaKaki = fructe.stream().anyMatch(fruct -> fruct.getNume().toLowerCase().equals("kaki"));

        System.out.println("=".repeat(10));

        List<Integer> iduriKaki = fructe.stream()
                .filter(FiltreFructe::existaKaki)
                .map(this::transformaInCod)
                .collect(Collectors.toList());


        System.out.println("=".repeat(10));

        iduriKaki.forEach(System.out::println);

        fructe.stream().min(this::compara).ifPresent(System.out::println);
    }


    /**
     * Va fi folosit ca method reference (::) in interiorul
     * streamului
     */
    private String transforma(Fruct fruct) {
        return fruct.getNume();
    }

    private int transformaInCod(Fruct fruct) {
        return fruct.getCod();
    }


    private int compara(Fruct f1, Fruct f2) {
        return f1.getCod() - f2.getCod();
    }
}
