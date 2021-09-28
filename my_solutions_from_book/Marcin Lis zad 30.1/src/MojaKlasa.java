
public class MojaKlasa implements PierwszyInterfejs {
	private int liczba;
	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}
	public int getLiczba() {
		return liczba;
	}
	public int setAndGet(int liczba) {
		int temp = this.liczba;
		this.liczba = liczba;
		return temp;
	}
	public String toString() {
		return "Wartosc pola liczba wynosi: " + liczba;		
	}
}
