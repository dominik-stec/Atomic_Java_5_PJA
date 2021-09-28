
public class Test {

	public static void main(String[] args) {
		int [] tab = new int [10];
		int i, j;
		for (i = 0, j = 101; j<=110; i++, j++) {
			tab[i] = j;
		}
		for (i=0; i<tab.length; i++) {
			System.out.println ("tab[" + i + "] = " + tab[i]);
		}
	}

}
