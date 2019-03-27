import java.util.ArrayList;

public class Sirket {
	
	private String ad;
	private ArrayList<Ucak> ucak;
	
	public Sirket(String ad) {
		this.ad = ad;
		ucak = new ArrayList<Ucak>();
	}
	
	public void ucakEkle(String ad ) {
		Ucak tmp = new Ucak(ad);
		ucak.add(tmp);
	}
	
	public void sirketTanit() {
		System.out.println("Sirket adi: " + ad);
		System.out.println("Ucak sayisi: " + ucak.size());
		for(Ucak u : ucak) {
			u.ucakTanit();
		}
	}
	
	public Ucak getUcak(String ad) {
		for(Ucak u : ucak) {
			if(u.getAd().equals(ad)) {
				return u;
			}
		}
		return null;
	}
	
}
