package ro.trc.ziua3.clase;

import java.util.ArrayList;
import java.util.Collection;

public final class ArrayListCurs<K> extends ArrayList<K> {

    @Override
    public boolean add(K k) {
        boolean success = false;
        System.out.println("Ma pregatesc sa adaug o inregistrare");

        success = super.add(k);

        if(success){
            System.out.println("Am adaugat cu success");
        } else {
            System.out.println("Nu am reusit sa adaug");
        }

        return success;
    }
}

/*
 *
 * scrieCerereInBazaDeDate(Cerere) {
 *   //trimit un mail
 * }
 *
 *
 * */