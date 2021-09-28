
public class Main {

	public static void main(String[] args) {
		Tablica tablica = new Tablica();
		
		try {
			tablica.ustawElement(-2, 22);
		 }
		catch (ArrayIndexOutOfBoundsException e) {
			tablica.wystapilBlad = true;
			if (tablica.wystapilBlad) System.out.println("Nieprawidlowy indeks tablicy...");
		}	
		
		//tablica.ustawElement(-2, 22);
		
		
	}

}
