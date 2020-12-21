package ro.trc.ziua4.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiciuSalutare {

    @Value("${salutare.mesaj}")
    private String mesaj;

    public String getMesajSalutare() {
        return mesaj;
    }

}
