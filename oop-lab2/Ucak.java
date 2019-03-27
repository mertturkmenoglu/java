import java.util.ArrayList;

public class Ucak {
	
	private String ad;
	private ArrayList<Gorevli> gorevli;
	
	public Ucak(String ad) {
		this.ad = ad;
		gorevli = new ArrayList<Gorevli>();
	}
	
	public void gorevliEkle(Gorevli g) {
		gorevli.add(g);
	}
	
	public void ucakTanit() {
		System.out.println("Ucak adi: " + ad);
		System.out.println("Gorevli adlari: ");
		for(Gorevli g : gorevli) {
			System.out.println(g.toString());
		}
	}
	
	public String getAd() {
		return ad;
	}

}
