package ro.trc.ziua1;

import java.util.Properties;

public class ChestionarMain {

    public static void main(String[] args) {
        try {
            Properties intrebariChestionar = new Properties();
            intrebariChestionar.load(ChestionarApp.class.getResourceAsStream("/app.properties"));

            new ChestionarApp().executa(intrebariChestionar);
        }catch (Exception e) {
            System.out.println("Exceptie la rularea programului");
        }
    }
}
