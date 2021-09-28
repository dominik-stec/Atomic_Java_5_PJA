
public class Main {

	public static void main(String[] args) {
		try {
			TablicaPunktow tab = new TablicaPunktow(0,0);
			tab.ustawWspolrzedne(2,4,0);
			System.out.println(tab.oddajPunkt(0).x + " " + tab.oddajPunkt(0).y);
			tab.ustawWspolrzedne(1, 3, 4);
			System.out.println(tab.oddajPunkt(5).x + " " + tab.oddajPunkt(5).y);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Przekroczony indeks tablicy, istnieja punkty o numerach od 0 do 3");
		}
	}
}
