
public class Main {

	public static void main(String[] args) {
		Wyjatki wyjatki = new Wyjatki();
		try {
			wyjatki.f();
		}
		catch (Exception e) {
			System.out.println ("Wyjatek: metoda Main");
			throw e;
		}
	}

}
