
public class Punkt {
	private int [] tab = new int [2];
	public void ustawX (int x) {
		tab[0] = x;
	}
	public void ustawY (int y) {
		tab[1] = y;
	}
	public int pobierzX () {
		return tab[0];
	}
	public int pobierzY () {
		return tab[1];
	}
}
