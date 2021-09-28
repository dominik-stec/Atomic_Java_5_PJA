import java.io.*;

public class Main2 {

	public static void main(String[] args) {
		StreamTokenizer strTok = new StreamTokenizer(
				new BufferedReader(
						new InputStreamReader(System.in)
						)
				);
		
		System.out.print("Wprowadz liczbe: ");
		
		try{
			while(strTok.nextToken() != StreamTokenizer.TT_NUMBER){
				if (strTok.nextToken() == StreamTokenizer.TT_EOF) break;
				System.out.println("To nie jest poprawna liczba.");
				System.out.print("Wprowadz lcizbe: ");
			}
		}
		catch(IOException e){
			System.out.print("Blad podczas odczytu danych ze strumienia");
			return;
		}
		
		double liczba = strTok.nval;
		System.out.print(liczba + " * 2 = " + liczba * 2);

	}

}
