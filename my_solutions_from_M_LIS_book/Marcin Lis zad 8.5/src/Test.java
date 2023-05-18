
public abstract class Test {

	public static void main(String[] args) {
		int zmienna = 12;
		String flaga = "zero";
		if (zmienna == 1 || zmienna == 4 || zmienna == 8) flaga = "niebieski";
		else if (zmienna == 2 || zmienna == 3 || zmienna == 7) flaga = "czerwony";
		switch (flaga) {
		case "niebieski" : {
			System.out.println("Zmienna wynosi 1 lub 4 lub 8");
			break;
		}
		case "czerwony" : {
			System.out.println ("Zmienna wynosi 2 lub 3 lub 7");
			break;
		}
		default : {
			System.out.println("Zmienna wynosi: " + zmienna);
			break;
		}
		}
	}

}
