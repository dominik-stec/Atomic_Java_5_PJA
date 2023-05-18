
public class Test {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=20; i++) {
			if (i%2==0) continue;
			System.out.println ("Liczby nieparzyste z zakresu 1 do 20 to: " + i);
		}
	}

}
