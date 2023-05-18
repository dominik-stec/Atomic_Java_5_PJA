
public class Test {

	public static void main(String[] args) {
		LiczbaCalkowita liczba = new LiczbaCalkowita();
		liczba.pobierzLiczbe();
		liczba.wyswietlLiczbe();
		liczba.x = 2;
		liczba.wyswietlLiczbe();
		liczba.pobierzLiczbe();
		liczba.wyswietlLiczbe();
		
		
		Prostokat figura = new Prostokat();
		
		
		
		figura.A.x = 9;
		figura.A.y = 3;
		
		figura.wyswietlWspolrzedne(figura.A);
		
		figura.B.x = figura.pobierzPunktY(figura.A);
		figura.B.y = figura.pobierzPunktX(figura.A);
		
		figura.wyswietlWspolrzedne(figura.B);
		
		
		
		

				
		
		
	}

}
