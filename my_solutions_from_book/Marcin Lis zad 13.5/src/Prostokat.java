
public class Prostokat {
	Punkt B = new Punkt();
	Punkt D = new Punkt();

	void wspolrzedneA() {
		int x = D.x;
		int y = B.y;
		System.out.println("Wspolrzedne punktu A (" + x + "," + y + ")");
	}
	void wspolrzedneC() {
		int x = B.x;
		int y = D.y;
		System.out.println("Wspolrzedne punktu C (" + x + "," + y + ")");
	}
}
