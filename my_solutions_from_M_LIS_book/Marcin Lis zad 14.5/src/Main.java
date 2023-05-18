
public class Main {

	public static void main(String[] args) {
		Punkt punkt = new Punkt();
		punkt.x = 1;
		punkt.y = 2;
		Punkt punkt2 = new Punkt();
		punkt2.ustawXY(3,5);
		punkt.WyswietlWspolrzedne();
		//punkt.ustawXY(punkt2);
		punkt.WyswietlWspolrzedne();
		punkt2.WyswietlWspolrzedne();
		System.out.println("Stare wspolrzedne " + punkt2.ustawXY(punkt).x);
		punkt2.WyswietlWspolrzedne();
		punkt2.ustawX(punkt);
		punkt2.WyswietlWspolrzedne();
		System.out.println("Stare wspolrzedne " + punkt2.ustawXY(punkt).y);
	}

}
