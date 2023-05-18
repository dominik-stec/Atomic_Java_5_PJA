
public class Main {

	public static void main(String[] args) {
		NoweOpakowanie pudelko = new NoweOpakowanie();
		pudelko.liczba = 2;
		System.out.println(pudelko.pobierzWartosc(true));
		NoweOpakowanie pudelko2 = new NoweOpakowanie();
		pudelko2.liczba = 3;
		System.out.println(pudelko2.pobierzWartosc(false));
	}

}
