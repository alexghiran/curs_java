package ro.trc.ziua3.clase;

public class CheieMasina extends Cheie {

    //4 CM
    public CheieMasina() {
        String[] abc = new String[5];
    }

    class Obiect {
        private int id;
        private String denumire;

        public Obiect(int id, String denumire) {
            this.id = id;
            this.denumire = denumire;
        }

        @Override
        public String toString() {
            return "id=" + id + ", denumire=" + denumire;
        }
    }

    void print() {
        Obiect obiect = new Obiect(34, "Tablou");
        System.out.println(obiect);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("java");
        }
    }


}
