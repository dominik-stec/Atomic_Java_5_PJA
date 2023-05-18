
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

	void czyProstokat () {
		if (A.x == D.x && B.x == C.x && A.y == B.y & C.y == D.y) System.out.println ("Podane wpolrzedne tworza prostokat");
		else System.out.println("Podane wspolrzedne nie tworza prostokata");
	}
	
}



