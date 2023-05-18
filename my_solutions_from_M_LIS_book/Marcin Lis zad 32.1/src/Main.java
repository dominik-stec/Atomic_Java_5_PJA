import java.io.*;

public class Main {

	public static void main(String[] args) {
		StreamTokenizer strTok = new StreamTokenizer(
				new BufferedReader(
						new InputStreamReader(System.in)
						)
				);
		
		System.out.print("wprowadz pierwsza liczbe: ");
		
		try {
			while(strTok.nextToken() != StreamTokenizer.TT_NUMBER) {
				System.out.println("To nie jest poprawna liczba");
				System.out.println("Wprowadz poprawna liczbe: ");
			}
		}
		catch(IOException e) {
			System.out.print("Blad podczas odczytu danych ze strumienia.");
			return;
		}
		
		double pierwszaLiczba = strTok.nval;
		
		System.out.print("Wprowadz druga liczbe: ");
		try{
			while(strTok.nextToken() != StreamTokenizer.TT_NUMBER){
				System.out.println("To nie jest poprawna liczba.");
				System.out.print("Wprowadz druga liczbe: ");
			}
		}catch(IOException e){
			System.out.print("Blad podczas odczytu ddanych ze strumienia.");
			return;
		}
		
		double drugaLiczba = strTok.nval;
		double wynik = pierwszaLiczba * drugaLiczba;
		System.out.println(pierwszaLiczba + " * " + drugaLiczba + " = " + wynik);
	}

}