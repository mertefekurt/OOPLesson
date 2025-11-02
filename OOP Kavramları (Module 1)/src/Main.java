public class Main {
    public static void main(String[] args) {
        System.out.println("=== MODÜL 2: OOP (Kapsülleme) ===");
        KisiGelismis kisi = new KisiGelismis("Ahmet", 25, 1500);
        System.out.println("İsim: " + kisi.getIsim());
        System.out.println("Yaş: " + kisi.getYas());
        System.out.println("Bakiye: " + kisi.getBakiye());
        kisi.paraYatir(500);
        kisi.setBakiye(-200);
    }
}

class KisiGelismis {
    private String isim;
    private int yas;
    private double bakiye;

    public KisiGelismis(String isim, int yas, double bakiye) {
        this.isim = isim;
        this.yas = yas;
        this.bakiye = bakiye;
    }
    public String getIsim() { return isim; }
    public int getYas() { return yas; }
    public double getBakiye() { return bakiye; }
    public void setBakiye(double bakiye) {
        if (bakiye >= 0) this.bakiye = bakiye;
        else System.out.println("Hata: Bakiye negatif olamaz!");
    }
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
        }
    }
}
