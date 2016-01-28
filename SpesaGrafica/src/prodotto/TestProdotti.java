package prodotto;

public class TestProdotti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotti primo = new Prodotti();
		Prodotti second = new Prodotti("sdgfs", "gomma", 20);
		System.out.println(primo);
		System.out.println(second);
		second.applicaSconto();
		System.out.println(second);

		Nalimentare p2 = new Nalimentare("sadgsw", "tavolo", 10, "legno");
		System.out.println(p2);
		p2.applicaSconto();
		System.out.println(p2);

		Nalimentare p3 = new Nalimentare("ASgf", "foglio", 5, "carta");
		System.out.println(p3);
		p3.applicaSconto();
		System.out.println(p3);

		Nalimentare p4 = new Nalimentare("whd", "bottiglia", 30, "plastica");
		System.out.println(p4);
		p4.applicaSconto();
		System.out.println(p4);

		Nalimentare p5 = new Nalimentare("wsbha", "finestra", 140, "vetro");
		System.out.println(p5);
		p5.applicaSconto();
		System.out.println(p5);

	}

}
