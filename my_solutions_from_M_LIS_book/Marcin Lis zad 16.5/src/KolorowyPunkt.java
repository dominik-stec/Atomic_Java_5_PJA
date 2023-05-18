
public class KolorowyPunkt extends Punkt {
	int kolor;
	void ustawKolor (int kolor) {
		this.kolor = kolor;
	}
	int pobierzKolor () {
		return kolor;
	}
	KolorowyPunkt() {
		super();
		kolor = 0;
	}
	KolorowyPunkt(int x, int y, int kolor) {
		super(x, y);
		this.kolor = kolor;
	}
	KolorowyPunkt(Punkt punkt, int kolor) {
		super(punkt);
		this.kolor = kolor;
	}
	KolorowyPunkt(KolorowyPunkt punkt) {
		super(punkt);
		kolor = punkt.kolor;
	}
 	void Wyswietl() {
 		KolorowyPunkt punkt = this;
 		System.out.println("Wspolrzedne/kolor: ");
 		punkt.WyswietlWspolrzedne();
 		System.out.println ("kolor-kod: " + kolor);
 	}
}
