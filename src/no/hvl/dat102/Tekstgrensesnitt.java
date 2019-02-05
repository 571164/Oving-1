package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Tekstgrensesnitt {

	// lese opplysningene om en CD fra tastatur
	public CD lesCD() {

		String cd_nummerTxt = showInputDialog("Skriv inn cd-nummer:");
		int cd_nummer = parseInt(cd_nummerTxt);

		String artist = showInputDialog("Skriv inn artist:");

		String tittel = showInputDialog("Skriv inn tittel:");

		String årTxt = showInputDialog("Skriv inn årstall:");
		int år = parseInt(årTxt);

		String sjangerTxt = showInputDialog("Velg sjanger:\n\n1. POP\n2. ROCK\n3. OPERA\n4. KLASSISK\n");
		int sjangerInt = parseInt(sjangerTxt);
		Sjanger sjanger = Sjanger.finnSjanger(sjangerInt);

		String plateselskap = showInputDialog("Skriv inn plateselskap:");

		CD cd = new CD(cd_nummer, artist, tittel, år, sjanger, plateselskap);
		return cd;

	}

	// vise en CD med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visCD(CD cd) {
		showMessageDialog(null,
				"Nr. " + cd.getCdNummer() + "\nArtist: " + cd.getArtist() + "\nTittel: " + cd.getTittel() + "\nÅr: "
						+ cd.getÅr() + "\nSjanger: " + cd.getSjanger() + "\nPlateselskap: " + cd.getPlateselskap());
	}

	// Skrive ut alle CD-er med en spesiell delstreng i tittelen
	public void skrivUtCdDelstrengITittel(CDarkivADT cda, String delstreng) {

		CD[] funnet = cda.sokTittel(delstreng);

		for (int i = 0; i < funnet.length; i++) {
			funnet[i].skrivUt(funnet[i]);
		}

	}

	// Skriver ut alle CD-er av en artist / en gruppe
	public void skrivUtCdArtist(CDarkivADT cda, String delstreng) {

		CD[] funnet = cda.sokArtist(delstreng);

		for (int i = 0; i < funnet.length; i++) {
			funnet[i].skrivUt(funnet[i]);
		}

	}

	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt
	// og hvor mange det er i hver sjanger
//	public void skrivUtStatistikk(CDarkivADT cda) {
//		int antall = cda.getAntall();
//		String statistikk = "";
//
//		for (int i = 0; i < antall; i++) {
//			statistikk += cda.visCD(cd);
//
//		}
//
//	}

}
