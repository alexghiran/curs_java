package ro.trc.ziua2.expresiiBoolean;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExpresiiBooleanTest {
    @Test
    public void compare() {
        for (int i = 0; i < 10; i++) {
            comparaNumere(new Random().nextInt(99), new Random().nextInt(99));
        }
    }



    @Test
    public void operatiiBoolean() {
        //sintaxa cand avem nevoie de ambele
        // conditii sa fie adevarate
        if(primaConditie() && altaConditie()) {
            System.out.println("ambele conditii sunt adevarate");
        }

        //sintaxa cand avem nevoie ca doar una din
        //conditii sa fie adevarata
        if(primaConditie() || altaConditie()) {
            System.out.println("una din ele este adevarata");
        }
    }

    private boolean primaConditie() {
        return false;
    }

    private boolean altaConditie() {
        return true;
    }

    /**
     * foloseste operatorul ternar
     * */
    private void comparaNumere(int a, int b) {
        String rezultat = a > b ?
                a + " mai mare decat " + b :
                a + " mai mic decat " + b;

        System.out.println(rezultat);
    }
}
