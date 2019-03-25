public abstract class Personel {

    protected String id;
    protected String adSoyad;
    protected Daire ev;

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
