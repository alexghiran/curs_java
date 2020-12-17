package ro.trc.ziua2.ExempleString;

import org.junit.jupiter.api.Test;

public class StringsEgalitate {
    @Test
    public void stringEgal() {
        String primaValoare = "abc   ";
        String valoareaDoi = "abc";

        primaValoare = scoateSpatiiAlbe(primaValoare);

        System.out.println(primaValoare == valoareaDoi ?
                "Valoarea " + primaValoare + " este egala cu " + valoareaDoi :
                "Valoarea " + primaValoare + " nu este egal cu " + valoareaDoi);

    }

    private String scoateSpatiiAlbe(String valoare) {
        return valoare.trim();
    }
}
