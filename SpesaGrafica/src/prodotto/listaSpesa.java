package prodotto;

public class listaSpesa {
	boolean tessera;
	private Prodotti lista[];
	private int numProdotti;
	private int maxProdotti;

	public listaSpesa(boolean tessera) {
		this.numProdotti = 0;
		this.maxProdotti = 100;
		this.lista = new Prodotti[100];
		this.tessera = tessera;
	}

	public void aggiungiProdotto(Prodotti P) throws Exception {
		if (numProdotti < maxProdotti) {
			lista[numProdotti++] = P;
		} else {
			throw exception("La lista è piena");
		}
	}
	public void eliminaProdotto(int pos) throws Exception {
		if(numProdotti == 0 || pos > numProdotti){
			for (int i = pos;i < numProdotti;i++){
				lista[i]=lista[i+1];
			}
		}
		else{
			throw exception("errore nell'eliminazione");
		}
		
	}
	private Exception exception(String string) { 
		// TODO Auto-generated method stub
		return null;
	}

	public double calcolaTotale() {
		double totale = 0;
		for (int i = 0; i < numProdotti; i++) {
			totale = totale + lista[i].getPrezzo();
		}
		return totale;
	}
}
