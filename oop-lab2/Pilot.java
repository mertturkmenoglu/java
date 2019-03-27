public class Pilot extends Gorevli {
	
	public Pilot(int id, String gorevliAdi, double maas) {
		super(id, gorevliAdi, maas);
	}
	
	@Override
	public void maasGuncelle() {
		setMaas(getMaas() * 1.25);
	}
	
}
