import java.util.Scanner;

public class Daire {

    private int kapiNo;
    private Oda[] odalar;

    public Daire(int kapiNo) {
        this.kapiNo = kapiNo;
        odalar = new Oda[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Oda0");
        String tmp = sc.nextLine();
        odalar[0] = new Oda(tmp);
        //odalar[0] = new Oda("oturma odasi");
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
