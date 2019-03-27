public abstract class Gorevli {
	private int id;
	private String gorevliAdi;
	private double maas;
	
	public Gorevli(int id, String gorevliAdi, double maas) {
		this.id = id;
		this.gorevliAdi = gorevliAdi;
		this.maas = maas;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	public abstract void maasGuncelle();
	
	@Override
	public String toString() {
		return ("id:" + id + "\tGorevliAdi:\t" + gorevliAdi + "\t\tMaas: " + maas);
	}

}
