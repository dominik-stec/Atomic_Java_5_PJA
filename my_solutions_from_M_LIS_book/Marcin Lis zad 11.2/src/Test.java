
public class Test {

	public static void main(String[] args) {
		int [] tab = new int[10];
		int i, j;
		for(i=10, j=0; i<=100; i+=10, j++ ){
			tab[j] = i;
		}
		for (i=0; i<tab.length; i++) {
			System.out.println ("tab[" + i + "] = " + tab[i]);
		}
	}

}
