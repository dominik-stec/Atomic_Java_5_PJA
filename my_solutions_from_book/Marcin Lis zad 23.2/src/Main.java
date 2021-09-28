
public class Main {

	public static void main(String[] args) {
		Pochodna pochodna = new Pochodna();
		Bazowa bazowa;
		bazowa = pochodna;
		Pochodna pochodna2;
		pochodna2 = (Pochodna) bazowa;
		
	}

}
