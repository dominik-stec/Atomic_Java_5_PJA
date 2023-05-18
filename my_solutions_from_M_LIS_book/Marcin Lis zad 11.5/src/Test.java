
public class Test {

	public static void main(String[] args) {
		int [] tab = new int [100];
		int i, j;
		for (i = 0; i<100; i++) {
			for (j=0; j<10; j++) {
				if (i%10==j) tab[i] = j;
			}
		}
		for (i=0; i<tab.length; i++) {
			System.out.println ("tab[" + i + "] = " + tab[i]);
		}
	}

}
