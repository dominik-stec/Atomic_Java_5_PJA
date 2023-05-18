
public class Test {

	public static void main(String[] args) {
		int i = 1;
		do {
			if (i%3==0) continue;
			System.out.println("LIczby z zakresu od 1 do 30 niepodzielne przez 3 to: " + i);
		}
		while (i++<30);
	}

}
