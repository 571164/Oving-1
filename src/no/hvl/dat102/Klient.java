package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;
import java.util.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Klient {

	public static void main(String[] args) {

		CDarkivADT cda = new CDarkiv(10);
		Meny meny = new Meny(cda);

		meny.start();

	}

}
