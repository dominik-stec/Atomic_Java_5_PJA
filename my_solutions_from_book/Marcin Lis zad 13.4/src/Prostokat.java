
public class Prostokat {
	
	Punkt A = new Punkt();
	Punkt B = new Punkt();
	Punkt C = new Punkt();
	Punkt D = new Punkt();
	
	
	
	
	int pobierzPunktX (Punkt p) {
		return p.x;
	}
	int pobierzPunktY (Punkt p) {
		return p.y;
	}
	
	void wyswietlWspolrzedne(Punkt p) {
		System.out.println ("Wszpolrzedne punktu: (" + p.x + "," + p.y + ")");
	}
}

