import java.io.*;

public class Main {

	public static void main(String[] args) {
		StreamTokenizer strTok = new StreamTokenizer(
				new BufferedReader(
						new InputStreamReader(System.in)
						)
				);
		
		;
		strTok.eolIsSignificant(true);
		
		double liczba;
		String napis = "";
		boolean warunekPetli = true;
		
		System.out.println("Wprowadz tekst lub wpisz \"quit\"");
		
		try{
						
			while (strTok.ttype != StreamTokenizer.TT_EOL || warunekPetli) {
				
				
				strTok.nextToken();
				
				if (strTok.ttype == StreamTokenizer.TT_EOL && warunekPetli){
					System.out.println ("");
					System.out.println ("Wprowadz tekst lub wpisz \"quit\"");
				}
				if (strTok.ttype == StreamTokenizer.TT_NUMBER) {
					liczba = strTok.nval;
					System.out.println(liczba);
				}
				if (strTok.ttype == StreamTokenizer.TT_WORD) {
					if ("quit".equals(strTok.sval)) warunekPetli = false;
					napis = strTok.sval;
					if (!"quit".equals(napis)) System.out.println(napis);
				}
				
				
				
				
			
		}
			if ("quit".equals(napis)) {
				System.out.println ("");
				System.out.println("Do Widzenia");
			}
			
			
		}
		catch(IOException e) {
			System.out.println("Blad podczas odczytu strumienia");
		}
		
	}
}
