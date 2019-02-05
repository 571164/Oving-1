package no.hvl.dat102.adt;

import no.hvl.dat102.CD;
import no.hvl.dat102.Sjanger;

public interface CDarkivADT {

	/**
	 * 
	 * @return, henter fram og returnerer en cd-tabell
	 */
	public CD[] hentCdTabell();

	/**
	 * 
	 * @param nyCd, legger inn en ny cd
	 */
	public void leggTilCd(CD nyCd);

	/**
	 * 
	 * @param cdNr
	 * @return om cd-en vart slettet eller ikkje
	 */
	public boolean slettCd(int cdNr);

	/**
	 * 
	 * @param delstreng, en delstreng av en tittel
	 * @return en tabell av cd-er
	 */
	public CD[] sokTittel(String delstreng);

	/**
	 * 
	 * @param delstreng, en delstreng av en artist
	 * @return en tabell av cd-er
	 */
	public CD[] sokArtist(String delstreng);

	/**
	 * 
	 * @param sjanger
	 * @return antall sjangere
	 */
	public int antallSjanger(Sjanger sjanger);

	/**
	 * Returnerer antaall cd-er i tabellen
	 * 
	 * @return antall cd-er
	 */
	public int antall();

	/**
	 * 
	 * @param cdNummer
	 * @return
	 */
	public int finnes(int cdNummer);

	/**
	 * 
	 * @param cdNummer
	 * @return
	 */
	public CD finnCD(int cdNummer);


	public int getAntall();

}
