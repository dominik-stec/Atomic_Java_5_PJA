
public class Test {

	public static void main(String[] args) {
		boolean [] tab = new boolean [20];
		int i;
		for (i = 0; i<20; i++) {
			if (i%2==0) tab[i] = true;
			else tab [i] = false;
		}
		for (i=0;i<tab.length;i++) {
			System.out.println ("tab[" + i + "] = " + tab[i]);
		}
	}

}
