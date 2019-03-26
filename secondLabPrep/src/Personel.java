public abstract class Personel {

    private String id;
    private String adSoyad;
    private Daire ev;

    Personel(String id, String adSoyad, Daire ev) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.ev = ev;
    }

    abstract void kendiniTanit();

    public int getDaireKapiNo() {
        return this.ev.getKapiNo();
    }

    public Daire getEv() {
        return ev;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getId() {
        return id;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setEv(Daire ev) {
        this.ev = ev;
    }

    public void setId(String id) {
        this.id = id;
    }
}
