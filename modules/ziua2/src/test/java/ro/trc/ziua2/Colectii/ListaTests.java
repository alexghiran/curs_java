package ro.trc.ziua2.Colectii;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ListaTests {
    @Test
    public void testLista() {
        ArrayList<ArePret> listaObieteCuPret = new ArrayList<>();

        Tablou tablou = new Tablou();
        Masina masina = new Masina();

        listaObieteCuPret.add(tablou);
        listaObieteCuPret.add(masina);

        ArrayList<Tablou> tablouri = new ArrayList<>();
        tablouri.add(tablou);

    }

    @Test
    public void araryTestGeneric() {

        Tablou tablou = new Tablou();
        Masina masina = new Masina();

        ArePret masinaNoua = new Masina();

        ArePret[] elemente = new ArePret[3];
        elemente[0] = tablou;
        elemente[1] = masina;
        elemente[2] = masinaNoua;
    }
}
