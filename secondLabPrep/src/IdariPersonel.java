public class IdariPersonel extends Personel{
    private int hizmetYili;

    public IdariPersonel(int hizmetYili, String id, String adSoyad, Daire ev) {
        super(id, adSoyad, ev);
        this.hizmetYili = hizmetYili;
    }

    public void setHizmetYili(int hizmetYili) {
        this.hizmetYili = hizmetYili;
    }

    public int getHizmetYili() {
        return hizmetYili;
    }

    @Override
    void kendiniTanit() {
        System.out.println("Id: " + getId() + "\tAd soyad: " + getAdSoyad() + "\tKapi No: " + getDaireKapiNo() + "\tHizmet yili: " + hizmetYili);
    }
}
