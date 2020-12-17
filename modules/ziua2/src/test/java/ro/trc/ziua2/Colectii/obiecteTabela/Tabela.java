package ro.trc.ziua2.Colectii.obiecteTabela;

import ro.trc.ziua2.GeneratorNumarPropriu;
import ro.trc.ziua2.NumarPropriu;

public class Tabela extends BaseTabela {
    private NumarPropriu id;

    public Tabela() {

        /*
         * de fiecare cand cineva va instantia clasa noastra
         * noi vom genera pentru el id-ul
         * */
        this.id = new GeneratorNumarPropriu().genereaza();
    }

    public NumarPropriu getId() {
        return id;
    }

    /**
     * il punem private pentru ca nu vrem ca utilizatorii clase noastre
     * sa seteze ei id-uri;
     */
    private void setId(NumarPropriu id) {
        this.id = id;
    }
}
