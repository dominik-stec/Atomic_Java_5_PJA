import java.io.*;

public class Main {

	public static void main(String[] args) {
		StreamTokenizer strTok = new StreamTokenizer(
				new BufferedReader(
						new InputStreamReader(System.in)
						)
				);
		System.out.println("Wprowadz piersza liczbe:");
		System.out.println("");
		
		try{
			while(strTok.nextToken() != StreamTokenizer.TT_NUMBER) {
				System.out.println("To nie jest poprawna liczba: " + strTok.sval);
				System.out.println("Wprowadz poprawnie liczbe:");
				System.out.println("");
		}
		}
		catch(IOException e) {
			System.out.println("Blad podczas odczytu danych ze strumienia.");
		}
		
		double pierwszaLiczba = strTok.nval;
		
		System.out.println("Wprowadz druga liczbe:");
		System.out.println("");
		
		try{
			while(strTok.nextToken() != StreamTokenizer.TT_NUMBER) {
				System.out.println("To nie jest poprawna liczba: " + strTok.sval);
				System.out.println("Wprowadz poprawnie liczbe:");
				System.out.println("");
		}
		}
		catch(IOException e) {
			System.out.println("Blad podczas odczytu danych ze strumienia.");
		}
		
		double drugaLiczba = strTok.nval;
		
		System.out.println("");
		System.out.println("Dziekuje");
		System.out.println("");
		
		System.out.println(pierwszaLiczba + " + " + drugaLiczba + " = " + (pierwszaLiczba + drugaLiczba));
		System.out.println(pierwszaLiczba + " - " + drugaLiczba + " = " + (pierwszaLiczba - drugaLiczba));
		System.out.println(pierwszaLiczba + " * " + drugaLiczba + " = " + (pierwszaLiczba * drugaLiczba));
		System.out.println(pierwszaLiczba + " / " + drugaLiczba + " = " + (pierwszaLiczba / drugaLiczba));
	}

}
