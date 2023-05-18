
public class Test {

	
	public static void main(String[] args) {
	int[][] tab = new int [10][];
	int i, j;
	
	
	fibonacci fibonacci = new fibonacci (0);
	
	for(i = 0; i<tab.length; i++){
		tab [i] = new int [fibonacci.wynik = fibonacci.f_fibonacci(i+1)];
		}
	
	for(i=0; i<tab.length; i++) {
		for(j=0; j<tab[i].length; j++) {
			tab [i][j] = tab[i].length - j;
		}
	}
	
	for (i=0; i<tab.length; i++) {
		System.out.println("tab [" + i + "] = ");
		for (j=0;  j<tab[i].length; j++) {
			System.out.print(tab[i][j] + " ");
			}
		System.out.println("");
	}
	
	}
}
