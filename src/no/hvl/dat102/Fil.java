package no.hvl.dat102;

import java.io.*;
import java.io.FileReader;
import java.lang.Integer;

import no.hvl.dat102.adt.CDarkivADT;

public class Fil {

	final static String SKILLE = "#";

	public static void lesFraFil(CDarkivADT cdarkiv, String filnavn) {

		FileReader fil = null;
		try {
			fil = new FileReader(filnavn);
		} catch (FileNotFoundException e) {
			System.out.println("Filen er ikke funnet");
		}

		BufferedReader leser = null;
		int n;
		String CDinfo;
		try {
			leser = new BufferedReader(fil);
			n = Integer.parseInt(leser.readLine());
			CDinfo = leser.readLine();

			for (int i = 0; i < n; i++) {
				String[] cd = CDinfo.split(SKILLE);

				int cd_nummer = Integer.parseInt(cd[0]);
				String artist = cd[1];
				String tittel = cd[2];
				int år = Integer.parseInt(cd[3]);
				Sjanger sjanger = Sjanger.valueOf(cd[4]);
				String plateselskap = cd[5];
				CDinfo = leser.readLine();
				CD cd1 = new CD(cd_nummer, artist, tittel, år, sjanger, plateselskap);
				System.out.println(cd1.toString());
			}
			fil.close();
		} catch (IOException e) {
			System.out.println("Problemer med filen");
		}
		System.out.println("Printet ut til filen");

	}

}