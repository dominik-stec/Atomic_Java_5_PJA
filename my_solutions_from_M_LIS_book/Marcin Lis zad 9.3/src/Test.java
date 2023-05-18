
public class Test {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("Liczby od 1 do 20 niepodzielne przez 3:");
		while (i++ < 20){
			if (i%3!=0) System.out.println(i);
			System.out.println ("Wartosc iteracji: " + i);
		}
	}

}
