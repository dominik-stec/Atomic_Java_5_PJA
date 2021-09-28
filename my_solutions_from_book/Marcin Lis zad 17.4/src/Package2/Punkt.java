package Package2;

public class Punkt {
	private double sinusalfa;
	private double modul;
	public int pobierzY() {
		double y = modul * sinusalfa;
		return (int) y;
	}
	public int pobierzX() {
		double x = modul * Math.sqrt(1-sinusalfa*sinusalfa);
		return (int) x;
	}
	public void ustawX (int wspX) {
		int x = wspX;
		int y = pobierzY();
		
		modul = Math.sqrt(x*x + y*y);
		sinusalfa = y /modul;
	}
	public void ustawY (int wspY) {
		int x = pobierzX();
		int y = wspY;
		
		modul = Math.sqrt(x*x + y*y);
		sinusalfa = y / modul;
	}
}
