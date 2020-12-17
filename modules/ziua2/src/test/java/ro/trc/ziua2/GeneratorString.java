package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorString {
    private static final int MIN = 65;
    private static final int MAX = 90;

    /**
     * genereaza un string format din caractere aleatoare
     * generatorul a fost testat cu metoda testUnicitateId insa
     * nu este foarte relevant pentru cod de productie.
     */
    public String genereaza(int numarCaractere) {
        char caracterGenerat;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numarCaractere; i++) {
            caracterGenerat = (char) (MIN + new Random().nextInt((MAX - MIN) + 1));
            sb.append(caracterGenerat);
        }


        return sb.toString();
    }

    //generez un numar nou intre MIN si MAX - OK
    //adaug caracterul asociat numarului generat la un string existent (creez stringul daca este prima data)

    @Test
    public String genereaza() {
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            //65 + (GENERAT(90-65 +1))
            char caracterGenerat = (char) (MIN + new Random().nextInt(MAX - MIN + 1));
            id.append(caracterGenerat);
        }

        return id.toString();
    }

    @Test
    public void testGenereaza() {
        for (int i = 0; i < 1000; i++) {
            genereaza();
        }
    }

    /**
     * ruleaza ok pentru 100_000 de generari
     */
    @Test
    public void testUnicitateId() {
        //ca sa verificam daca un id a fost sau nu generat anterior
        //facem o lista in care tine salvate toate id-urile generate
        //ulterior, la fiecare id pe care il vom genera vom verifica
        //daca el exista deja in cache-ul nostru local
        List<String> cacheNumereGenerate = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            String idGenerat = genereaza();
            if (cacheNumereGenerate.contains(idGenerat)) {
                System.out.println("Id-ul " + idGenerat + "deja exista in cache");
            } else {
                cacheNumereGenerate.add(idGenerat);
            }

            //exprima din 500 in 500
            if (i > 0 && i % 500 == 0) {
                System.out.println("Generez in continuare; am ajuns la " + i);
            }

        }
    }

    @Test
    public void testNanoTime() {
        for (int i = 0; i < 10; i++) {
            System.out.println(System.nanoTime());
        }
    }

    //sa incercam sa vedem daca se repeta vreun id generat

}
