package L3;

public class main {
    public static void main(String[] args) {
        System.out.println("=== MODÜL 3: OOP (Kalıtım) ===");

        Hayvan hayvan = new Hayvan("hayvancıklar");
        hayvan.sesCikar();

        kus kus = new kus("pamukcuk");
        kus.sesCikar();

        Kopek kopek = new Kopek("Gazzoooz");
        kopek.sesCikar();
    }
}

class Hayvan {
    protected String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    void sesCikar() {
        System.out.println(isim + " bir ses çıkardı. karnı acıkmıs olabilir");
    }
}

class kus extends Hayvan {
    public kus(String isim) {
        super(isim);
    }

    @Override
    void sesCikar() {
        System.out.println(isim + " cikledi ");
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    void sesCikar() {
        System.out.println(isim + " havladı ");
    }
}