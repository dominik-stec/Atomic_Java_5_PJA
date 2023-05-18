
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
void ustawX (Punkt punkt) {
	punkt = new Punkt();
	x = punkt.x;
}
void ustawY (Punkt punkt) {
	punkt = new Punkt();
	y = punkt.y;
}
}
