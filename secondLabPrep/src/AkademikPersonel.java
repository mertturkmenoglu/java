public class AkademikPersonel extends Personel{
    private String unvan;

    public AkademikPersonel(String unvan, String id, String adSoyad, Daire ev) {
        super(id, adSoyad, ev);
        this.unvan = unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getUnvan() {
        return unvan;
    }

    @Override
    void kendiniTanit() {
        System.out.println("Id: " + getId() + "\tAd soyad: " + getAdSoyad() + "\tKapi No: " + getDaireKapiNo() + "\tUnvan: " + unvan);
    }
}
