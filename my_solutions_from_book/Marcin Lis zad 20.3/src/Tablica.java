
public class Tablica {
	private int[] tablica = new int[10];
	public boolean wystapilBlad = false;
	public int pobierzElement(int indeks) {
		return tablica[indeks];
		}
	
	public void ustawElement(int indeks, int wartosc) {
		tablica[indeks] = wartosc;
		}
}
	

