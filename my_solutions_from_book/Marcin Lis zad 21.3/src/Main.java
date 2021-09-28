
public class Main {

	public static void main(String[] args) {
		Punkt punkt = null;
		int liczba;
		try {
			liczba = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println ("Nieprawidlowa opercja arytmetyczna");
			liczba = 10;
			System.out.println ("Przypisuje zmiennej liczba wartosc 10");
			
		}
		try {
			punkt.x = liczba;
		}
		catch(NullPointerException e) {
			System.out.println("B³¹d ogólny");
		}
	}

}
