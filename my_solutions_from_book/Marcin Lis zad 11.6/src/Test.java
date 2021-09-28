
public class Test {

	public static void main(String[] args) {
		char [] tab = new char [26];
		int i, j;
		for(i = 0, j=97; i<26; i++, j++) {
			tab [i] = (char) j;
		}
		for (i=0;i<tab.length;i++) {
			System.out.println ("tab[" + i + "] = " + tab[i]);
		}
	}

}
