public class IdariPersonel extends Personel{
    private int hizmetYili;

    public IdariPersonel(int hizmetYili, String id, String adSoyad, Daire ev) {
        this.hizmetYili = hizmetYili;
        this.id = id;
        this.adSoyad = adSoyad;
        this.ev = ev;
    }

    public void setHizmetYili(int hizmetYili) {
        this.hizmetYili = hizmetYili;
    }

    public int getHizmetYili() {
        return hizmetYili;
    }

    @Override
    void kendiniTanit() {
        System.out.println("Id: " + id + "\tAd soyad: " + adSoyad + "\tKapi No: " + getDaireKapiNo() + "\tHizmet yili: " + hizmetYili);
    }
}
