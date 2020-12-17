package ro.trc.ziua2.Colectii.obiecteTabela;

public class CreatorTabele {

    public void creazaTabela(Tabela tabela) {
        //ne conectam la baza de date
        //rulam un scipt de CREATE_TABLE care ne face tabela noua

        System.out.println("Am creat tabela");
    }

    public void updateTabela(Tabela tabela, TabelaIstoric istoric) {
        //ne conectam la baza de date
        //rulam script de ALTER_TABLE
        //adaugam informatia de modificare a tabele intr-un istoric

        System.out.println("Am facut update la tabela");
    }
}
