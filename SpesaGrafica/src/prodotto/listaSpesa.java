package prodotto;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import org.eclipse.jface.dialogs.MessageDialog;

public class listaSpesa {
	boolean tessera;
	protected Prodotti lista[];
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
			throw new Exception("La lista è piena");
		}
	}
	public void eliminaProdotto(int pos) throws Exception {
		if(numProdotti != 0 || pos < numProdotti){
			for (int i = pos;i < numProdotti;i++){
				lista[i]=lista[i+1];
			}
			numProdotti--;
		}
		else{
			throw new Exception("Errore nell'eliminazione");
		}
		
	}

	public Prodotti[] getLista() {
		return lista;
	}

	public void setLista(Prodotti[] lista) {
		this.lista = lista;
	}

	public int getNumProdotti() {
		return numProdotti;
	}

	public void setNumProdotti(int numProdotti) {
		this.numProdotti = numProdotti;
	}

	public double calcolaTotale() {
		double totale = 0;
		for (int i = 0; i < numProdotti; i++) {
			totale = totale + lista[i].getPrezzo();
		}
		if(tessera == true)
			totale = (totale * 95) / 100;
		return totale;
	}
	
	
	
}
