package ro.trc.ziua3.recapitulare;

import org.junit.jupiter.api.Test;

public class FileReaderTest {
    @Test
    public void testFileReader()  {
        FileReader reader = new FileReader();
        final String NUME_FISISER = "/application.xyz";

        try {
            //citim fisieul cu sintaxa echivalenta Java7
            String continut = reader.continutFisier(NUME_FISISER);
            System.out.println(continut);

            System.out.println("=".repeat(20));

            //citim fisierul cu sintaxa echivalenta Java11
            String continutJava11 = reader.continutFisierJava11(NUME_FISISER);
            System.out.println(continutJava11);


        }catch (BusinessException ex) {
            System.out.println("exceptie la citirea fisierului");
            ex.printStackTrace();
        }
    }
}
