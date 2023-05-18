
public class Main {

	public static void main(String[] args) {
		
		try{
				try {
					int tab[] = new int[0];
					tab[0] = 1;
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Pierwsze przechwycenie wyjatku / wewnetrzne / zagniezdzone");
					throw e;
				}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println ("Drugie przechwycenie wyjatku / zewnetrzne");
			throw e;
		}
		
		 
			
	
	}

}
