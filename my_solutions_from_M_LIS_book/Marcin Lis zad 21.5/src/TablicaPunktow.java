
public class TablicaPunktow extends Punkt {
	
	Punkt tab_punkt [] = new Punkt [4];
	
	TablicaPunktow (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void ustawWspolrzedne (int x, int y, int index) {
		if (index < 4 && index >0) {
			tab_punkt [index] = new TablicaPunktow(x,y);
		}
		else {
			System.out.println("Niepoprawny indeks tablicy...");
		}
	}
	
	Punkt oddajPunkt (int index) {
		if (index < 4 && index > 0) {
			return tab_punkt[index];
		}
		else {
			System.out.println("Niepoprawny indeks tablicy...");
			return null;
		}
	}
	
	void usunPunkt (int index) {
		if (index < 4 && index >= 0) {
			tab_punkt[index] = null; 
		}
		else {
			System.out.println ("Niepoprawny indeks tablicy...");
		}
	}
}
