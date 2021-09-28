import java.io.*;

public class Main {
	
	static String znak;
	
	void readLine(){
		
		try {
			znak = "";
			
			while (!znak.equals("quit")) {
			char przedZnak = (char) System.in.read();
			znak = String.valueOf( przedZnak );
			System.out.print(znak);
			}
			
			
			//System.out.println("Wprowadzony tekst to: " + wynik);
			}
			catch (IOException e){
				System.out.println("Blad podczas odczytu strumienia");
			}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Wprowadz dowolny tekst z klawiatury");
		Main h = new Main();
		h.readLine();
		
		
	}

}
