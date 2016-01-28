package prodotto;

public class Nalimentare extends Prodotti {

	private String materiale;

	public Nalimentare(String codice2, String descrizione2, int prezzo2, String materiale) {
		super(codice2, descrizione2, prezzo2);
		this.materiale = materiale;
	}

	@Override
	public String toString() {
		// return "Prodotti [codice=" + codice + ", prezzo=" + prezzo + ",
		// descrizione=" + descrizione + "]";
		return "Nalimentare codice=" + codice + ", prezzo=" + prezzo + ", descrizione=" + descrizione + ",  materiale="
				+ materiale + "";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nalimentare other = (Nalimentare) obj;
		if (materiale == null) {
			if (other.materiale != null)
				return false;
		} else if (!materiale.equals(other.materiale))
			return false;
		return true;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public void applicaSconto() {
		if (this.materiale.equals("carta") || this.materiale.equals("plastica") || this.materiale.equals("vetro")
				|| this.materiale.equals("legno")) {
			super.setPrezzo(getPrezzo() * 90 / 100);
		} else {
			super.applicaSconto();
		}

	}

}
