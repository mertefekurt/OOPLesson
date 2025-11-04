package L5;

public class main {
    public static void main(String[] args) {
        System.out.println("=== MODÜL 5: Arayüzler (Interfaces) ===");

        Calisan muhendis = new Muhendis("elif");
        Calisan ogretmen = new Ogretmen("mert");


        muhendis.calis();
        muhendis.kodyaz();
        ogretmen.calis();
    }
}

interface Calisan {
    void calis();
    void kodyaz();
}

class Muhendis implements Calisan {
    private String isim;

    public Muhendis(String isim) {
        this.isim = isim;
    }

    @Override
    public void calis() {
        System.out.println(isim + " mühendislik yapıyor ️");
    }

    public void kodyaz() {
        System.out.println(isim + " kod yazıyo ️");
    }
}

class Ogretmen implements Calisan {
    private String isim;

    public Ogretmen(String isim) {
        this.isim = isim;
    }
    public void kodyaz() {
        System.out.println(isim + " kod yazıyo ️");
    }

    @Override
    public void calis() {
        System.out.println(isim + " ders anlatıyor ");
    }
}