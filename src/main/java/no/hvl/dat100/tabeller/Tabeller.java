package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		int i;
		for(i=0; i<tabell.length;i++){
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		int i;
		String svar = "[";
		for (i= 0; i<tabell.length;i++){
			svar += tabell[i];
			if (i+1 < tabell.length){
				svar += ",";
			}
			}
		svar += "]";
		return svar;

	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		for(int i = 0; i<tabell.length; i++){
			if (tall == tabell[i]){
				finnes = true;
			}
		}
	return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for(int i = 0; i < tabell.length; i++){
			if( tall == tabell[i]){
				pos = i;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		int j = tabell.length;
		for(int i = 0;i < tabell.length;i++){
			j--;
			nyTabell[j] = tabell[i];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for(int i= 1; i < tabell.length;i++){
			if( tabell[i-1] > tabell[i]){
				sortert = false;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length+tabell2.length];
		int pos = 0; //posisjon i nyTabell
		for(int i = 0;i < tabell1.length; i++){
			nyTabell[pos] = tabell1[i];
			pos++;
		}
		for(int i = 0;i < tabell2.length; i++){
			nyTabell[pos] = tabell2[i];
			pos++;
		}
		return nyTabell;

	}
}
