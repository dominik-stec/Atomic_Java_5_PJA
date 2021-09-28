
public class Tablica {
	private int[] tablica = new int[10];
	public boolean wystapilBlad = false;
	public int pobierzElement(int indeks) {
		if(indeks >= tablica.length || indeks < 0) {
			wystapilBlad = true;
			return 0;
		}
		else {
			wystapilBlad = false;
			return tablica[indeks];
		}
	}
	public void ustawElement(int indeks, int wartosc) {
		if (indeks >= tablica.length || indeks < 0) {
			wystapilBlad = true;
		}
		else {
			tablica[indeks] = wartosc;
			wystapilBlad = false;
		}
	}
	
}
