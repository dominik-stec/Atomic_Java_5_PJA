public class Telefon
{
	private String numerTelefonu;
	private int lacznyCzasRozmow;
	private static double cenaRozmowy = 0.48; // z/min.
	private String [] wybieraneNumery = new String [10];
	int i = 1;
	

	public Telefon (String numer) {
		numerTelefonu = numer;
	}

	double obliczKwoteDoZaplaty() {
		return cenaRozmowy * (lacznyCzasRozmow / 60);
	}

	static void ustawCeneRozmowy(double nowaCena){
		cenaRozmowy = nowaCena;
	}

	void zadzwon(String nrTelefonu) {
		System.out.println ("Dzwonie do: " + nrTelefonu);
		System.out.println ("Rozmowa w toku...");
		int czasRozmowy = (int) (Math.random()*3600);
		lacznyCzasRozmow += czasRozmowy;
		System.out.println ("Rozmowa zakonczona.");
		System.out.println ("Czas rozmowy: " + czasRozmowy/60 + "min, " +
				czasRozmowy%60 + "sek.");
		
		wybieraneNumery[0] = numerTelefonu;
		
		
		if (nrTelefonu != null){
		do {
			wybieraneNumery[i] = nrTelefonu;
			i++;
			break;
		}
		while (true);
		}
	}
	
	void pokazWybieraneNumery () {
		System.out.println("Wybierane numery to: ");
		int i;
		for (i = 0; i<wybieraneNumery.length; i++) {
			System.out.println (wybieraneNumery[i]);
		}
	}
	
	public String pokazNumer () {
		return numerTelefonu;
	}
	
		
	
}
