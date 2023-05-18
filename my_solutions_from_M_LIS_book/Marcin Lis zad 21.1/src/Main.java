
public class Main {

	public static void main(String[] args) {
		try {
			int liczba = 10 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (RuntimeException e) {
			System.out.println(e);
		}
		
			
		
	}

}
