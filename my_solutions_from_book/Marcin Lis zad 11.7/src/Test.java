
public class Test {

	public static void main(String[] args) {
		short [] tab = new short[10];
		short i = 0;
		while (i<tab.length) {
			tab [i] = i;
			i++;
		}
		for (i=0; i<tab.length; i++){
			System.out.println ("tab[" + i + "] = " + tab[i]);
		}
	}

}
