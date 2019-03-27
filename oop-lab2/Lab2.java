public class Lab2 {
    public static void main(String[] args) {
        Sirket f = new Sirket("THY");
        f.ucakEkle("Catalcahoyuk");
        f.ucakEkle("Oludeniz");

        Gorevli a[] = new Gorevli[6];
        a[0] = new Pilot(1, "Ahmet", 50);
        a[1] = new Pilot(6, "Hatice", 50);
        a[2] = new Pilot(2, "Ayse", 50);
        a[3] = new KabinGorevlisi(3, "Ali", 50);
        a[4] = new KabinGorevlisi(4, "Fatma", 50);
        a[5] = new KabinGorevlisi(5, "Veli", 50);
        
        f.getUcak("Catalcahoyuk").gorevliEkle(a[0]);
        f.getUcak("Catalcahoyuk").gorevliEkle(a[1]);
        f.getUcak("Catalcahoyuk").gorevliEkle(a[2]);
        f.getUcak("Oludeniz").gorevliEkle(a[3]);
        f.getUcak("Oludeniz").gorevliEkle(a[4]);
        f.getUcak("Oludeniz").gorevliEkle(a[5]);
        
        f.sirketTanit();
        
        for(int i = 0; i < a.length; i++) {
            a[i].maasGuncelle();
        }
        
        f.sirketTanit();
    }
}
