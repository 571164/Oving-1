package no.hvl.dat102;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class CD {

	private int cd_nummer;
	private String artist;
	private String tittel;
	private int år;
	private Sjanger sjanger;
	private String plateselskap;

	// Konstruktør STANDARD
	public CD() {
		this(0, "", "", 0, null, "");
	}

	public CD(int cd_nummer, String artist, String tittel, int år, Sjanger sjanger, String plateselskap) {
		this.cd_nummer = cd_nummer;
		this.artist = artist;
		this.tittel = tittel;
		this.år = år;
		this.sjanger = sjanger;
		this.plateselskap = plateselskap;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public int getCdNummer() {
		return cd_nummer;
	}

	public String getTittel() {
		return tittel;
	}

	public String getArtist() {
		return artist;
	}

	public String getPlateselskap() {
		return plateselskap;
	}

	public int getÅr() {
		return år;
	}

	public void skrivUt(CD cd) {
		showMessageDialog(null, "Nr. " + cd_nummer + "\nArtist: " + artist + "\nTittel: " + tittel + "\nÅr: " + år
				+ "\nSjanger: " + sjanger + "\nPlateselskap: " + plateselskap);
	}

}
