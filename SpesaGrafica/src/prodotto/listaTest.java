package prodotto;

public class listaTest {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		
		listaSpesa ls = new listaSpesa(true);
		Prodotti P = new Prodotti("esrh", "caramelle", 100);
		P.applicaSconto();
		Nalimentare na= new Nalimentare ("<dsgvE", "chiave", 10, "plastica");
		na.applicaSconto();
		Alimentare a= new Alimentare ("qaewf", "pane", 5, new Data(12,06,2018));
			ls.aggiungiProdotto(P);
			ls.aggiungiProdotto(na);
			//ls.aggiungiProdotto(a);
			// TODO Auto-generated catch block
		System.out.println("Totale: "+ ls.calcolaTotale());
		ls.eliminaProdotto(0);
		System.out.println("Totale: "+ ls.calcolaTotale());
	}

}