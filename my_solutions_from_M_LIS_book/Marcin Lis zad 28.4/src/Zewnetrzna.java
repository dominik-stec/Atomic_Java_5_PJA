
public class Zewnetrzna {
	boolean x = true;
	public void metoda (boolean x) {
		
		if (x) {
			 class Wewnetrzna {
				 public void gdzieJestes () {
				System.out.println ("Jestem z Zewnetrzna->if->Wewnetrzna");
				}
			}
		}
		

	}
}
