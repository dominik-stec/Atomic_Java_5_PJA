import java.io.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader brIn = new BufferedReader(
				new InputStreamReader(System.in)
				);
		System.out.println("Wprowadzaj linie tekstu. Aby zakonczyc, wpisz quit.");
		String line = "";
		try{
			while(!line.equals("quit")) {
				line = brIn.readLine();
				if (line == null) break;
				System.out.println("Wprowadzona linia tekstu to: " + line);
			}
			System.out.println("Koniec wczytywania danych.");
			}
			catch(IOException e) {
				System.out.println("Blad podczas odczytu strumienia");
		}
	}
}
