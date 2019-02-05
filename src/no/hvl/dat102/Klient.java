package no.hvl.dat102;

public class KLIENT {

	public static void main(String[] args) {

		CDarkiv samling = new CDarkiv(10);
		
		CD cd1 = new CD(1, "Bob", "Hallo", 1997, Sjanger.finnSjanger(1), "Ol AS");
		samling.leggTilCd(cd1);
		samling.visCD(cd1);

	}

}
