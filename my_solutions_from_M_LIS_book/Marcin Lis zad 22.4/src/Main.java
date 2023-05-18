
public class Main {

	static int f (int x, int y) throws NegativeValueException {
		if ((x-y)<0) {
			throw new NegativeValueException("Ujemna wartoœæ ró¿nicy");
		}
		return (x - y);
	}
	
	public static void main(String[] args) throws NegativeValueException {
		System.out.println(f(2,5));
	}

}
