
public class Test {

	public static void main(String[] args) {
		int zmienna = 255;
		int zmienna1 = zmienna >> 2;
		int zmienna2 = zmienna << 2;
		int zmienna3 = zmienna >>> 2;
		
		System.out.println ("przesuniecie bitowe w prawo " + zmienna1 + "\n" + "przesuniecie bitowe w lewo " + zmienna2 + "\n" + "przesuniecie bitowe w prawo z zerami " + zmienna3 + "\n");

	}

}
