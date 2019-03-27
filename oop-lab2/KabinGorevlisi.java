public class KabinGorevlisi extends Gorevli {
	
	public KabinGorevlisi(int id, String gorevliAdi, double maas) {
		super(id, gorevliAdi, maas);
	}
	
	@Override
	public void maasGuncelle() {
		setMaas(getMaas() * 1.05);
	}
	
}
