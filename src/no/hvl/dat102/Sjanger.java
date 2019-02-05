package no.hvl.dat102;

public enum Sjanger {

	POP(1), ROCK(2), OPERA(3), KLASSISK(4);
	private int nr;

	/**
	 * 
	 * @param n, nummeret på sjanger-var.
	 */
	private Sjanger(int n) {
		nr = n;
	}

	public int getNr() {
		return nr;
	}

	// int-søk
	public static Sjanger finnSjanger(int n) {
		Sjanger sjanger = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.nr == n) {
				sjanger = sj;
				break;
			}
		}
		return sjanger;
	}

	// STRING-søk
	public static Sjanger finnSjanger(String n) {
		Sjanger sjanger = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().equals(n)) {
				sjanger = sj;
			}
		}
		return sjanger;
	}

}
