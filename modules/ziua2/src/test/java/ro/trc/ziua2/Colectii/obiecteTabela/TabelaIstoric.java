package ro.trc.ziua2.Colectii.obiecteTabela;

import java.time.Instant;
import java.time.LocalDateTime;

public class TabelaIstoric extends BaseTabela {

    private LocalDateTime dataUltimeiModificari;
    private String descriereModificare;

    public LocalDateTime getDataUltimeiModificari() {
        return dataUltimeiModificari;
    }

    /**
     * il facem private pentru ca nu vrem ca utilizatorii clasei noastre
     * sa foloseasca metoda ca portita de modificare a datei reale.
     */
    private void setDataUltimeiModificari(LocalDateTime dataUltimeiModificari) {
        this.dataUltimeiModificari = dataUltimeiModificari;
    }

    public String getDescriereModificare() {
        return descriereModificare;
    }

    public void setDescriereModificare(String descriereModificare) {
        this.descriereModificare = descriereModificare;
    }
}


