package ro.trc.ziua2;

import java.time.LocalDateTime;

/**
 * Clasa pentru generarea unei tabele
 */
public class GeneratorTabela {

    /**
     * Metoda pentru generarea unei tabele cu denumire fixa
     */
    public Tabela genereaza() {
        Tabela tabela = new Tabela();
        tabela.setDenumire("Persoane");
        tabela.setDataCreare(LocalDateTime.now());
        tabela.setId(new GeneratorNumarPropriu().genereaza());

        return tabela;
    }
}
