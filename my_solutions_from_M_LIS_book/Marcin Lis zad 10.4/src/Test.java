
public class Test {

	public static void main(String[] args) {
		int i;
		for (i = 1; i<=100; i++) {
			if (i % 4 != 0 || i%8==0 || i%10==0) continue;
			System.out.println ("Liczby podzielne przez 4 i niepodzielne przez 8 i przez 10 to: " + i);
		}
	}

}
