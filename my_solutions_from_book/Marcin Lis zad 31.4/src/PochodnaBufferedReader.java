
import java.io.*;

public class PochodnaBufferedReader extends BufferedReader {
	PochodnaBufferedReader () {
		super(new InputStreamReader(System.in));
	}
	
	public void getInt() {
		PochodnaBufferedReader pbr = new PochodnaBufferedReader();
		System.out.println("Wprowadz liczbe calkowita");
		String line = null;
		try {
			line = pbr.readLine();
		}
		catch(IOException e) {
			System.out.println("Blad podczas odczytu strumienia.");
			return;
		}
		
		int liczba;
		
		try {
			liczba = Integer.parseInt(line);
		}
		catch(NumberFormatException e) {
			System.out.println("Podana wartosc nie jest liczba calkowita");
			return;
		}
		System.out.println ("Podana liczba to " + liczba);
	}
	
	public void getDouble() {
		PochodnaBufferedReader pbr = new PochodnaBufferedReader();
		System.out.println("Wprowadz liczbe zmiennoprzecinkowa");
		String line = null;
		try {
			line = pbr.readLine();
		}
		catch(IOException e) {
			System.out.println("Blad podczas odczytu strumienia.");
			return;
		}
		
		double liczba;
		
		try {
			liczba = Double.parseDouble(line);
		}
		catch(NumberFormatException e) {
			System.out.println("Podana wartosc nie jest liczba zmiennoprzecinkowa");
			return;
		}
		System.out.println ("Podana liczba to " + liczba);
	}
	
	
}
