
public class Main {

	public static void main(String[] args) {
		Punkt punkt = null;
		int liczba = 0;
		try {
			try {
				liczba = 10 / 0;
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			punkt.x = liczba;
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
