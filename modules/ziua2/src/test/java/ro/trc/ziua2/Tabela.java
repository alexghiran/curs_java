package ro.trc.ziua2;

import java.time.LocalDateTime;


/**
 * Reprezentare sumara a unei tabele in care
 * id-ul este un numar pe care il generam cu o clasa proprie
 */
public class Tabela {
    private NumarPropriu id;
    private String denumire;
    private LocalDateTime dataCreare;

    public NumarPropriu getId() {
        return id;
    }

    public void setId(NumarPropriu id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public LocalDateTime getDataCreare() {
        return dataCreare;
    }

    public void setDataCreare(LocalDateTime dataCreare) {
        this.dataCreare = dataCreare;
    }


    @Override
    public String toString() {
        return "Tabela " + denumire + " cu id " + id + " creata la data: " + dataCreare;
    }
}
