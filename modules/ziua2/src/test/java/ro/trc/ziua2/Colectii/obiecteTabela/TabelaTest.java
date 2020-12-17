package ro.trc.ziua2.Colectii.obiecteTabela;

import org.junit.jupiter.api.Test;
import ro.trc.ziua2.NumarPropriu;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TabelaTest {


    @Test
    public void testeazaTabela() {
        Tabela tabelaPersoane = new Tabela();
        TabelaIstoric tabelaPersoaneIstoric = new TabelaIstoric();
        Tabela tabelaCereri = new Tabela();
        TabelaIstoric tabelaCereriIstoric = new TabelaIstoric();


        Tabela tabelaPersoane2 = new Tabela();

        //minunat
        List<BaseTabela> listaTabele = Arrays.asList(tabelaPersoane, tabelaCereri, tabelaPersoaneIstoric, tabelaCereriIstoric);

        tabelaPersoane.setDataNasterii(LocalDate.of(1985, Month.JUNE, 17));
        tabelaPersoane.setDenumire("denumire");
        tabelaPersoane.setPrenume("prenume");
        tabelaPersoane.setNume("nume");

        CreatorTabele creator = new CreatorTabele();
        creator.creazaTabela(tabelaPersoane);

        tabelaPersoane.setPrenume("alt prenume");
        tabelaPersoaneIstoric.setDescriereModificare("am modificat prenumele");
        creator.updateTabela(tabelaPersoane, tabelaPersoaneIstoric);
    }


}
