
public class Prostokat {
	
	LiczbaCalkowita liczba = new LiczbaCalkowita();
	
	int [] A = new int [2];
	int [] B = new int [2];
	int [] C = new int [2];
	int [] D = new int [2];
	
	{
	A[0] = liczba.x;
	A[1] = liczba.x;
	B[0] = liczba.x;
	B[1] = liczba.x;
	C[0] = liczba.x;
	C[1] = liczba.x;
	D[0] = liczba.x;
	D[1] = liczba.x;
	}
	
	int pobierzLiczbe (int tab[], int x) {
		return tab[x];
	}
	
	void wyswietlWspolrzedne() {
		System.out.println ("Wszpolrzedne punktu A ("+ A[0] + "," + A[1] + ")");
		System.out.println ("Wszpolrzedne punktu B ("+ B[0] + "," + B[1] + ")");
		System.out.println ("Wszpolrzedne punktu C ("+ C[0] + "," + C[1] + ")");
		System.out.println ("Wszpolrzedne punktu D ("+ D[0] + "," + D[1] + ")");
	}
}

