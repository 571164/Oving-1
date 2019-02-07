package no.hvl.dat102;

public class CDArkivKlient2 {

	public static void main(String[] args) {

//		CDarkivADT cda = new CDarkiv2();
//		Meny meny = new Meny(cda);

		Meny meny = new Meny(new CDarkiv2());
		meny.start();

	}

}
