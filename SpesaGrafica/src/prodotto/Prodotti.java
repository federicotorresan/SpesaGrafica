package prodotto;

public class Prodotti {

	protected int codice;
	protected float prezzo;
	protected String descrizione;

	public Prodotti() {
		this.codice = 0;
		this.prezzo = 0;
		this.descrizione = "";
	}

	public Prodotti(int codice2, String descrizione2, int prezzo2) {
		this.codice = codice2;
		this.descrizione = descrizione2;
		this.prezzo = prezzo2;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public int getCodice() {
		return codice;
	}

	public void setPrezzo(float f) {
		this.prezzo = f;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void applicaSconto() {
		prezzo = (prezzo * 95) / 100;

	}

	public String toString() {
		return "--Prodotti codice=" + codice + ", prezzo=" + prezzo + ", descrizione=" + descrizione + "--";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotti other = (Prodotti) obj;
		if (codice != other.codice)
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (prezzo != other.prezzo)
			return false;
		return true;
	}

}
