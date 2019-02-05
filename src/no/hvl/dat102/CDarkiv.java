package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;
import static javax.swing.JOptionPane.showMessageDialog;



public class CDarkiv implements CDarkivADT {

	private CD[] cdTabell;
	private int antall;

	// Konstruktør
	public CDarkiv(int max) {
		cdTabell = new CD[max];
		antall = 0;
	}

	public int getAntall() {
		return antall;
	}

	public CD[] hentCdTabell() {
		return cdTabell;
	}

	public void leggTilCd(CD nyCd) {
		if (antall == cdTabell.length) {
			utvidKapasitet();
		}

		int index = finnes(nyCd.getCdNummer());
		if (index >= 0 && antall < cdTabell.length) {
			cdTabell[antall] = nyCd;
			antall++;
		}
	}

	public boolean slettCd(int cdNr) {
		int index = finnes(cdNr);
		if (index >= 0) {
			cdTabell[index] = cdTabell[antall - 1];
			cdTabell[antall - 1] = null;
			antall--;
			return true;
		} else {
			return false;
		}
	}

	public CD[] sokTittel(String delstreng) {
		CD[] tab = new CD[cdTabell.length];

		for (int i = 0; i < tab.length; i++) {
			if (cdTabell[i].getTittel().contains(delstreng)) {
				tab[i] = cdTabell[i];
			}
		}
		return tab;

	}

	public CD[] sokArtist(String delstreng) {
		CD[] tab = new CD[cdTabell.length];

		for (int i = 0; i < tab.length; i++) {
			if (cdTabell[i].getArtist().contains(delstreng)) {
				tab[i] = cdTabell[i];
			}
		}
		return tab;
	}

	public int antallSjanger(Sjanger sjanger) {
		int antall = 0;
		for (int i = 0; i < cdTabell.length; i++) {
			if (cdTabell[i].getSjanger() == sjanger) {
				antall++;
			}
		}
		return antall;
	}

	public int antall() {
		return antall;
	}

	public void utvidKapasitet() {
		CD[] tab = new CD[(int) Math.ceil(cdTabell.length * 1.1)];
		for (int i = 0; i < cdTabell.length; i++) {
			tab[i] = cdTabell[i];
		}
	}

	public CD finnCD(int cdNummer) {
		boolean funnet = false;
		int i = 0;

		while (!funnet && i < antall) {
			if (cdTabell[i].getCdNummer() == cdNummer) {
				funnet = true;
			} else {
				i++;
			}
		}
		return cdTabell[i];
	}

	public int finnes(int cdNummer) {
		boolean funnet = false;
		int i = 0;

		while (!funnet && i < antall) {
			if (cdTabell[i].getCdNummer() == cdNummer) {
				funnet = true;
			} else {
				i++;
			}
		}
		if (funnet) {
			return i;
		} else {
			return -1;
		}
	}

	public void visCD(CD cd) {
		showMessageDialog(null,
				"Nr. " + cd.getCdNummer() + "\nArtist: " + cd.getArtist() + "\nTittel: " + cd.getTittel() + "\nÅr: "
						+ cd.getÅr() + "\nSjanger: " + cd.getSjanger() + "\nPlateselskap: " + cd.getPlateselskap());
	}

}
