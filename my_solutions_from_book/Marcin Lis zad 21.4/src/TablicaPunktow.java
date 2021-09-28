
public class TablicaPunktow extends Punkt {
	
	Punkt tab_punkt [] = new Punkt [4];
	
	TablicaPunktow (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void ustawWspolrzedne (int x, int y, int index) {
		tab_punkt [index] = new TablicaPunktow(x,y);
	}
	
	Punkt oddajPunkt (int index) {
		return tab_punkt[index];
	}
}
