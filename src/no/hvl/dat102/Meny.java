package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private CDarkivADT cda;

	public Meny(CDarkivADT cda) {
		tekstgr = new Tekstgrensesnitt();
		this.cda = cda;
//		cda = new CDarkiv(10);
	}

	public void start() {

		boolean kjør = true;

		while (kjør) {
			String valgTxt = showInputDialog("Valg:\n" + "1. Legg til ny CD\n" + "2. Slett en CD\n" + "3. Vis en CD\n"
					+ "4. Skriv ut cd-er (TITTEL)\n" + "5. Skriv ut cd-er (ARTIST)\n" + "6. Skriv ut statistikk");
			int valg = parseInt(valgTxt);

			switch (valg) {

			// LEGG TIL CD
			case (1): {
				cda.leggTilCd(tekstgr.lesCD());
				tekstgr.visCD(cda.finnCD(1));
				break;
			}

			// SLETT CD
			case (2): {
				String cdNummerTxt = showInputDialog("Skriv inn cd-nummer som skal slettes:");
				int cdNummer = parseInt(cdNummerTxt);
				boolean slettet = false;

				while (!slettet) {
					if (cda.slettCd(cdNummer)) {
						showMessageDialog(null, "Vellykket sletting.");
						slettet = true;
					} else {
						showMessageDialog(null, "Feil ved sletting, finner ikke cd-nummer...");
					}
				}
				break;
			}

			// VIS EN CD
			case (3): {
				String cdNummerTxt = showInputDialog("Skriv inn cd-nummer for info:");
				int cdNummer = parseInt(cdNummerTxt);
				CD cd = cda.finnCD(cdNummer);
				tekstgr.visCD(cd);
				System.out.println(cd);
				break;
			}

			// SKRIV UT CD-er (TITTEL)
			case (4): {
				String tittel = showInputDialog("Søk etter tittel:");
				tekstgr.skrivUtCdDelstrengITittel(cda, tittel);
				break;
			}

			// SKRIV UT CD-er (ARTIST)
			case (5): {
				String artist = showInputDialog("Søk etter artist:");
				tekstgr.skrivUtCdArtist(cda, artist);
				break;

			}
			case (0): {
				kjør = false;
			}

			// SKRIV UT CD-er (ARTIST)
//			case (6): {
//				tekstgr.skrivUtStatistikk(cda);
//			}
			}

		}

	}

}