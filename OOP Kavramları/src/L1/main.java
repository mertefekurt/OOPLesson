package L1;
public class main {
    public static void main(String[] args) {
        System.out.println("=== MODÜL 3: Kontrol Yapıları ===");
        KontrolYapilari k = new KontrolYapilari();
        k.dizilimiOrnegi();
        k.secenek(85);
        k.donguOrnegi();
    }
}

class KontrolYapilari {
    void dizilimiOrnegi() {
        System.out.println("1. adım");
        System.out.println("2. adım");
        System.out.println("3. adım");
    }
    void secenek(int puan) {
        if (puan >= 90) System.out.println("A");
        else if (puan >= 80) System.out.println("B");
        else if (puan >= 70) System.out.println("C");
        else System.out.println("F");
    }
    void donguOrnegi() {
        for (int i = 1; i <= 50; i++)
            System.out.println("Tekrar " + i);
    }
}