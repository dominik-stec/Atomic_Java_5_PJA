
public class Main {

	public static void main(String[] args) {
		Punkt3D punkt;
		punkt = new Punkt3D();
		punkt.WyswietlWspolrzedne();
		System.out.println ("Wspolrzedne punktu z to: " + punkt.z);
		punkt = new Punkt3D(1,2,3);
		punkt.WyswietlWspolrzedne();
		System.out.println ("Wspolrzedne punktu z to " + punkt.z);
		punkt = new Punkt3D (punkt);
		punkt.WyswietlWspolrzedne();
		System.out.println ("Wspolrzedne punktu z to " + punkt.z);
	}

}
