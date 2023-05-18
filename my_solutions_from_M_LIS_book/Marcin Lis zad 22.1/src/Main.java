
public class Main {

	public static void main(String[] args) {
		KlasaNull wyjatek = new KlasaNull();
		try {
			wyjatek.f();
		}
		catch (NullPointerException e) {
			System.out.println("przechwycono wyjatek");
		}
	}

}
