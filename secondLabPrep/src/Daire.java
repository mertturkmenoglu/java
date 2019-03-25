public class Daire {

    private int kapiNo;
    private Oda[] odalar;

    public Daire(int kapiNo) {
        this.kapiNo = kapiNo;
        odalar = new Oda[3];
        odalar[0] = new Oda("oturma odasi");
        odalar[1] = new Oda("yatak odasi");
        odalar[2] = new Oda("mutfak");
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }

    public int getKapiNo() {
        return kapiNo;
    }

}
