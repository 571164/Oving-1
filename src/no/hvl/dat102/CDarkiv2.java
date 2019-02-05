package no.hvl.dat102;
import no.hvl.dat102.adt.*;

public class CDarkiv2 implements CDarkivADT {

	private int antall;
	private LinearNode<CD> start;

	// Konstruktør
	public CDarkiv2() {
		start = null;
		antall = 0;
	}

	// PUSH
	public void leggTilCd(CD nyCd) {
		LinearNode<CD> temp = new LinearNode<CD>(nyCd);
		temp.setNeste(start);
		start = temp;
		antall++;	
	}
	
	
	// POP
	public boolean slettCd(int cdNr) {
		boolean slettet = false;
		if (antall>0) {
			start = start.getNeste();
			antall--;
			slettet = true;
		}
		return slettet;
	}
	
	
	
	
	

}
