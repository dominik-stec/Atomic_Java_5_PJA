
public class Punkt {
int x;
int y;
int pobierzY(){
	return y;
}
int pobierzX() {
	return x;
}
void ustawX(int x) {
	this.x = x;
}
void ustawY(int y) {
	this.y = y;
}
void ustawXY (int wspY) {
	y = wspY;
}
void ustawXY (int x, int y) {
	this.x = x;
	this.y = y;
}
void WyswietlWspolrzedne() {
	System.out.println ("Wspolrzedna x = " + x);
	System.out.println ("Wspolrzedna y = " + y);
}
int ustawX (Punkt punkt) {
	int x1 = x;
	
	x = punkt.x;
	return x1;
}
int ustawY (Punkt punkt) {
	int y1 = y;
	
	y = punkt.y;
	return y1;
}
Punkt ustawXY (Punkt punkt) {
	Punkt punktStare = new Punkt();
	
	punktStare.x = x;
	punktStare.y = y;
	x = punkt.x;
	y = punkt.y;
	return punktStare;
	}
}
