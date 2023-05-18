
public class Punkt {
int x;
int y;
int pobierzY(){
	return y;
}
int pobierzX() {
	return x;
}
void ustawX(int wspX) {
	x = wspX;
}
void ustawY(int wspY) {
	y = wspY;
}
void ustawXY (int wspY) {
	y = wspY;
}
void ustawXY (int wspX, int wspY) {
	x = wspX;
	y = wspY;
}
void WyswietlWspolrzedne() {
	System.out.println ("Wspolrzedna x = " + x);
	System.out.println ("Wspolrzedna y = " + y);
}
int ustawX (Punkt punkt) {
	int x1 = x;
	punkt = new Punkt();
	x = punkt.x;
	return x1;
}
int ustawY (Punkt punkt) {
	int y1 = y;
	punkt = new Punkt();
	y = punkt.y;
	return y1;
}
}
