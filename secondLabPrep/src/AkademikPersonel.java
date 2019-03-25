public class AkademikPersonel extends Personel{
    private String unvan;

    public AkademikPersonel(String unvan, String id, String adSoyad, Daire ev) {
        this.unvan = unvan;
        this.id = id;
        this.adSoyad = adSoyad;
        this.ev = ev;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    @Override
    void kendiniTanit() {
        System.out.println("Id: " + id + "\tAd soyad: " + adSoyad + "\tKapi No: " + getDaireKapiNo() + "\tUnvan: " + unvan);
    }
}
