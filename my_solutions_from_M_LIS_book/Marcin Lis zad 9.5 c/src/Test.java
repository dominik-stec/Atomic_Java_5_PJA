
public class Test {

	public static void main(String[] args) {
		int i = 1;
		do {
			if (i%2==0) System.out.println(i + " - liczba parzysta");
			else System.out.println (i + " - liczba nieparzysta");
		}
		while(i++<20);
	}

}
