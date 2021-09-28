
public class fibonacci {
	int wynik;
	
	fibonacci (int liczba) {
		wynik = liczba;
	}
	
	int f_fibonacci (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		int f1=1, f2=2;
		int i;
		for(i = 2; i<n; i++) {
			int m = f1 + f2;
			f1 = f2;
			f2 = m;
		}
		return f2;
	}
}