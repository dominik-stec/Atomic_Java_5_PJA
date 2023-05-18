
public class Main {

	public static void main(String[] args) {
		
		Wyjatki wyjatki = new Wyjatki();
		
		try {
			wyjatki.b();
			wyjatki.a();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wyjatek a");
		}
		
		//wyjatki.b();
		//wyjatki.a();
		//wyjatki.b();
		
	}

}
