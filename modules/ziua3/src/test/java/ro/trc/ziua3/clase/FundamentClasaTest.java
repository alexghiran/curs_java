package ro.trc.ziua3.clase;


import java.util.ArrayList;
import java.util.List;

public class FundamentClasaTest {

    @org.junit.jupiter.api.Test
    public void testFundamentClasa() {
        FundamenteClasa clasa = new FundamenteClasa();
        clasa.caracteristica = "vizibilitate publica";
        FundamenteClasa clasa2 =new FundamenteClasa();
        FundamenteClasa clasa3 =new FundamenteClasa();
        FundamenteClasa clasa4 =new FundamenteClasa();


        clasa.actiuneInteresanta();

        List<FundamenteClasa> lista = new ArrayList<>();

        System.out.println("Total elemente create: " + clasa4.numarInstante());
    }
}
