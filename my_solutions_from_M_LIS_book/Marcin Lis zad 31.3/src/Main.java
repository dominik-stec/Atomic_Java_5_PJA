import java.io.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader brIn = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		System.out.print("Wprowadz liczbe zmiennoprzecinkowa");
		
		String line = null;
		
		try {
			line = brIn.readLine();
		}
		catch(IOException e) {
			System.out.print ("Blad podczas odczytu strumienia");
			return;
		}
		
		double liczba;
		
		try {
			liczba = Double.parseDouble(line);
		}
		catch(NumberFormatException e) {
			System.out.println("Podana wartosc nie jest liczba calkowita.");
			return;
		}
		System.out.println(liczba + " * 2 = " + liczba * 2);
	}

}
