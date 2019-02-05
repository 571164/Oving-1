package no.hvl.dat102;

//import no.hvl.dat102.adt.CDarkivADT;

public class CDArkivKlient {

	public static void main(String[] args) {

		Meny meny = new Meny(new CDarkiv(10));
		meny.start();

	}

}
