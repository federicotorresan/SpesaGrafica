package prodotto;

public class Alimentare extends Prodotti {

	Data scadenza;

	public Alimentare(int codice, String descrizione, int prezzo, Data scadenza) {
		super(codice, descrizione, prezzo);
		this.scadenza = scadenza;
	}

	public void setScadenza(Data scadenza) {
		this.scadenza = scadenza;
	}

	public Data getScadenza() {
		return scadenza;
	}

	public void applicaSconto() {
		if (scadenza.getDifference(new Data()) < 10) {
			prezzo = prezzo * 0.8f;
		} else {
			super.applicaSconto();
		}
	}

}
