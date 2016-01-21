package prodotto;

public class listaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listaSpesa ls = new listaSpesa(true);
		Prodotti P = new Prodotti(12, "caramelle", 100);
		P.applicaSconto();
		Nalimentare na= new Nalimentare (5, "chiave", 10, "plastica");
		na.applicaSconto();
		Alimentare a= new Alimentare (8, "pane", 5, new Data(12,06,2018));
		try {
			ls.aggiungiProdotto(P);
			ls.aggiungiProdotto(na);
			//ls.aggiungiProdotto(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Totale: "+ ls.calcolaTotale());
	}

}