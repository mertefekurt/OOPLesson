package L4;

public class main {
    public static void main(String[] args) {
        System.out.println("=== MODÜL 4: Polimorfizm ve Soyutlama ===");

        Sekil daire = new Daire(5);
        Sekil dikdortgen = new Dikdortgen(4, 6);

        daire.alanHesapla();
        dikdortgen.alanHesapla();
    }
}

abstract class Sekil {
    abstract void alanHesapla();
}

class Daire extends Sekil {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        double alan = Math.PI * yaricap * yaricap;
        System.out.println("daire alanı: " + alan);
    }
}

class Dikdortgen extends Sekil {
    private double genislik, yukseklik;

    public Dikdortgen(double genislik, double yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    @Override
    void alanHesapla() {
        double alan = genislik * yukseklik;
        System.out.println("dikgortgen alanı: " + alan);
    }
}