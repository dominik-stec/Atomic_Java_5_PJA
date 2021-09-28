
public class Punkt {
	static int x;
	int y;
	Punkt () {
		x = 1;
		y = 1;
	}
	Punkt (int wspX, int wspY) {
		x = wspX;
		y = wspY;
	}
	Punkt (Punkt punkt) {
		x = punkt.x;
		y = punkt.y;
	}
}
