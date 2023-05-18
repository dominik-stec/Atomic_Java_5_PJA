
public class Main {

	public static void main(String[] args) {
		TablicaPunktow punkt = new TablicaPunktow(0,0);
		punkt.ustawWspolrzedne(1,2,2);
		System.out.println (punkt.oddajPunkt(2).x);
		System.out.println (punkt.oddajPunkt(2).y);
		punkt.usunPunkt(2);
		//System.out.println(punkt.oddajPunkt(2).x);
		
		
			
		
		
	}
}
