
public class Test {

	public static void main(String[] args) {
		int [][]tab = new int[4][];
		int i;
		for(i=0; i < tab.length; i++) {
		tab [i] = new int[i + 1];
		}
		int j;
		int k = 10;
		for (i=0; i<tab.length; i++) {
			for (j=0; j<tab[i].length; j++) {
				tab [i][j] = k--;
			}
		}
		for (i=0; i<tab.length; i++) {
			System.out.println("tab [" + i + "][] = "); 
			for (j=0; j<tab[i].length; j++) {
				System.out.print ("[" + i + "][" + j + "] = " + tab [i][j] + "  ||  ");
				}
			System.out.println("");
			}
		}
	}


