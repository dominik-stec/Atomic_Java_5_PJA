
public class Wyjatki {
	
	public void f() {
		try {
			g();
		}
		catch(Exception e) {
			System.out.println ("Wyjatek metoda f");
			throw e;
		}
	}
	
	public void g() {
		try {
			h();
		}
		catch(RuntimeException e) {
			System.out.println("Wyjatek metoda g");
			throw e;
		}
	}
	
	public void h() {
		
		try {
		int x = 1;
		int y = 0;
		float z = x/y;
		}
		catch(ArithmeticException e) {
			System.out.println("Wyjatek metoda h");
			throw e;
		}
	}
}
