package ro.trc.ziua2;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Random;

public class TabelaTest {
    @Test
    public void testTabela() {
        Tabela persoane = new Tabela();
        persoane.setDenumire("Persoane");
        persoane.setDataCreare(LocalDateTime.now());

        //trebuie sa compleam id-ul
        NumarPropriu id = new GeneratorNumarPropriu().genereaza();
        persoane.setId(id);

        System.out.println(persoane);
    }


    @Test
    public void testTabelaCuGenerator() {
        for (int i = 0; i < 50; i++) {
            System.out.println(new GeneratorTabela().genereaza());
        }
    }

    /**
     * exemplu prin care verificam tabelul ASCII
     * */
    @Test
    public void abc() {
        for (char i = 40; i < 50; i++) {
            System.out.println(i);
        }
    }

    //generator de tabela > generator de numar propriu

    //un for prin care sa apelam de 50 de ori crearea tabelei


}
