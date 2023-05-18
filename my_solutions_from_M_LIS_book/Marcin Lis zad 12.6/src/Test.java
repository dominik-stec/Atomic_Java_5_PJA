
public class Test {

	public static void main(String[] args) {
		int[][] tab = new int [10][];
		int i,j=2,k = 1;
		
		
		fibonacci fibonacci = new fibonacci (0);
		
		for(i = 0; i<tab.length; i++){
			
			if (((fibonacci.wynik = fibonacci.f_fibonacci(k)) % 2) != 0) {tab[i] = new int [fibonacci.wynik = fibonacci.f_fibonacci(k)];}
			else 
				for (; ; ) {
					if (((fibonacci.wynik = fibonacci.f_fibonacci(j)) %2) != 0) {tab[i] = new int [fibonacci.wynik = fibonacci.f_fibonacci(j)]; k = j; ++k;++j; break;}
				}
			
			
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
//i=0 | 1%2!=0 | tab[0] = 1 |
//i=1 | 2%2==0 | else | 2%2==0 | false | j = 1 | ... | tab[1] = fibonacci(3) = 3 | zmienne = 1 | j = 1
//i=2 | 3%2!=1 | true | tab [2] = fibonacci(4) = 5