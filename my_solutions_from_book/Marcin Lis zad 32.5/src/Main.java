import java.io.*;

public class Main {
	
	public double pobierzLiczbe(StreamTokenizer strTok) throws IOException
	{	
		while(strTok.nextToken() != StreamTokenizer.TT_NUMBER) {
			KodowanieZnakow.koduj().println("To nie jest poprawna liczba.");
			KodowanieZnakow.koduj().println("WprowadŸ poprawn¹ liczbê: ");
		}
		return strTok.nval;
		
	}
	
	public void oblicz(double A, double B, double C) {
		KodowanieZnakow.koduj().println("Parametry równania:\n");
		KodowanieZnakow.koduj().println("A: " + A + " B: " + B + " C: " + C + "\n");
		
		if (A == 0) {
			KodowanieZnakow.koduj().println("To nie jest równanie kwadratowe: A=0!");
		}
		else{
			double delta = B * B - 4 * A * C;
			
			if (delta < 0){
				KodowanieZnakow.koduj().println("Delta < 0");
				KodowanieZnakow.koduj().println("To równanie nie ma rozwi¹zañ w " +
									"zbiorze liczb rzeczywistych.");
			}
			else if(delta > 0) {
				double wynik;
				wynik = (-B + Math.sqrt(delta)) / (2 * A);
				KodowanieZnakow.koduj().println("Rozwiazanie: x1 = " + wynik);
				wynik = (-B - Math.sqrt(delta)) / (2 * A);
				KodowanieZnakow.koduj().println(", x2 = " + wynik);
			}
		}
	}
	
	public void start() {
		StreamTokenizer strTok = new StreamTokenizer(
				new BufferedReader(
						new InputStreamReader(System.in)
						)
				);
		
		double paramA = 0;
		double paramB = 0;
		double paramC = 0;
		
		try{
			KodowanieZnakow.koduj().println("Podaj parametr A: ");
			paramA = pobierzLiczbe(strTok);
			KodowanieZnakow.koduj().println("Podaj parametr B: ");
			paramB = pobierzLiczbe(strTok);
			KodowanieZnakow.koduj().println("Podaj parametr C: ");
			paramC = pobierzLiczbe(strTok);
			KodowanieZnakow.koduj().println("");
		}
		catch(IOException e) {
			KodowanieZnakow.koduj().println("B³¹d podczas odczytu strumienia.");
			return;
		}
		oblicz(paramA, paramB, paramC);
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.start();
		
	}

}
