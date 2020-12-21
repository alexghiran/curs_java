package ro.trc.ziua4.service;

import org.springframework.stereotype.Component;
import ro.trc.ziua4.adnotare.Selectabil;

@Component
@Selectabil(value = "serviciu", nume = "serviciu selectabil")
public class ServiciuSelectabil {

    public void teamGasit() {
        System.out.println("am fost gasit");
    }
}
