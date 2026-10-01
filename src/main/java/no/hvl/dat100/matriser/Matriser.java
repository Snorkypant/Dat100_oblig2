package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] i : matrise){
			for(int j : i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String svar = "";
		for (int[] i : matrise) {
			int counter = 0;

			for (int j : i) {
				counter++;
				if (counter == i.length) { // for å passe på at det ikke kommer mellomrom etter siste tallet på hver rad
					svar += j;
				} else {
					svar += j + " ";
				}
			}
			svar += "\n";
		}
		return svar;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length]; // antar at alle rader er like store
		int counterRad= 0; // hvilke rad den er på
		int counterPos= 0; // hvor i raden den er
		for(int[] i: matrise){
			counterPos = 0;
			for(int k : i){
				k*= tall;
				nyMatrise[counterRad][counterPos] = k;
				counterPos++;
			}
			counterRad++;
		}
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = true;
		int counterRad = 0; // samme som forrige oppg
		int counterPos = 0; // samme som forrige


		if(a.length == b.length) {

			for (int[] i : a) {

				counterPos = 0;

				for (int k : i) {

					if (k != b[counterRad][counterPos]) {
						erLik = false;
					}
					counterPos++;
				}
				counterRad++;
			}
		} else{
			erLik = false;
		}
		return erLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
