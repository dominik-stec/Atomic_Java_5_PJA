
public class Test {

	public static void main(String[] args) {
		int [][]tab = new int [4][];
		int i = 0;
		while (i<4) {
			tab [i] = new int [4-i];
			i++;
		}
		int licznik = 1;
	    int j = 0;
	    while (i<tab.length) {
	    	while (j<tab[i].length) {
	    		tab [i][j] = licznik ++;
	    		i++;j++;
	    	}
	    }
	    while (i<tab.length){
	    	System.out.println("tab[ " + i + " ] = ");
	    	while (j<tab[i].length) {
	    		System.out.print(tab [i][j] + " ");
	    		i++;j++;
	    	}
	    	System.out.println("");
	    }
	} 

}
