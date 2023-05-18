
public class Tablica {
	private int tablica[] = new int[10];
	public int pobierzElement (int indeks) throws InvalidIndexException {
		if (indeks < 0 || indeks > 9) {
			throw new InvalidIndexException("Niepoprawny indeks tablicy w metodzie pobierzElement()");
		}
		return tablica[indeks];
	}
	public void ustawElement (int indeks,  int wartosc) throws InvalidIndexException {
		if (indeks < 0 || indeks > 9) {
			throw new InvalidIndexException ("Niepoprawny indeks tablicy w metodzie ustawElement()");
		}
		tablica[indeks] = wartosc;
	}
}
