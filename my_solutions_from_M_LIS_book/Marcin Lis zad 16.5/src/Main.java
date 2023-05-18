
public class Main {

	public static void main(String[] args) {
		KolorowyPunkt punkt;
		punkt = new KolorowyPunkt();
		punkt.Wyswietl();
		punkt = new KolorowyPunkt(1,2,3);
		punkt.Wyswietl();
		punkt = new KolorowyPunkt(punkt);
		punkt.Wyswietl();
	}

}
