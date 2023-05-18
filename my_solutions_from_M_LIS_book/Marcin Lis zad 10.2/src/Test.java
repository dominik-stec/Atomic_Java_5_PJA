
public class Test {

	public static void main(String[] args) {
		int i = 0;
		while (i++<20) {
			if (i%2==0) continue;
			System.out.println ("Liczby nieparzyste z zakresu od 1 do 20 to: " + i);
		}
		
	}

}
