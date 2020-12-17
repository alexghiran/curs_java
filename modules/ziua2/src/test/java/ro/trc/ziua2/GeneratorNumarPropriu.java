package ro.trc.ziua2;

import java.util.Random;

public class GeneratorNumarPropriu {

    public NumarPropriu genereaza() {
        int numar = new Random().nextInt(999);
        String code = new GeneratorString().genereaza(10);
        return new NumarPropriu(numar, code);
    }
}
