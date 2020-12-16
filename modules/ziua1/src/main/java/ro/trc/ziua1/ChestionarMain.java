package ro.trc.ziua1;

import java.util.Properties;

public class ChestionarMain {

    /**
     * <p>
     * Reprezinta punctul principal de intrare in aplicatie.
     * Metoda are un caracter obligatoriu pentru toate aplicatiile java
     * care ruleaza in varianta desktop (Java SE)
     * </p>
     */
    public static void main(String[] args) {
        Properties intrebariChestionar;
        try {
            intrebariChestionar = new Properties();
            intrebariChestionar.load(ChestionarApp.class.getResourceAsStream("/app.properties"));

            new ChestionarApp().executa(intrebariChestionar);
        } catch (Exception e) {
            System.out.println("Exceptie la rularea programului; programul se va inchide");
        }
    }
}


/**
 * Chestionar > +Intrebari > +Optiuni -> 1 raspuns
 * <p>
 * 1. Obiect de tip Chestionar
 * > numele chestionarului
 * > data la care a fost creat
 * > autor
 * > lista intrebari
 * 2. Obiect de tip Intrebare
 * > enunt
 * > autor
 * > data la care a fost adaugata
 * > lista de optiuni
 * 3. Obiect de tip Optiune -> boolean (optiunea este corecta sau nu)
 * > enunt
 * > esteCorect (boolean, true false)
 * 4. Obiect de tip Raspuns (varianta nedorita)
 * <p>
 * <p>
 * a) aaa b) bbb c) ccc => a)
 */
