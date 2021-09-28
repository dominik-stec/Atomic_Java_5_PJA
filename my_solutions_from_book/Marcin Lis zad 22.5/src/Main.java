
public class Main {

	public static void main(String[] args) {
		Tablica tablica = new Tablica();
		tablica.ustawElement(10, 5);
		int liczba = tablica.pobierzElement(10);
		System.out.println (liczba);
	}

}
