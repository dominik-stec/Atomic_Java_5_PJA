
public class Main {

	public static void main(String[] args) {
		Tablica tablica = new Tablica();
		tablica.ustawElement(-5, 10);
		if (tablica.wystapilBlad) {
		 	System.out.println("Nieprawidlowy indeks tablicy...");
		}
		else {
			tablica.ustawElement(-5, 10);
		}
		int liczba = tablica.pobierzElement(5);
		if (tablica.wystapilBlad) {
			System.out.println ("Nieprawidlowy indeks tablicy...");
		}
		else {
			System.out.println(liczba);
		}
		
	}

}
