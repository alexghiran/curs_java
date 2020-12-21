package ro.trc.ziua3.recapitulare;

public class BusinessException extends Exception {

    public BusinessException(String mesaj, Exception anterior) {
        super(mesaj, anterior);
    }
}
