import java.io.*;

public class ShowLine {
	Console con = System.console();
	
	public void iterateAndPrint () {
		
		if (con != null) {
		con.printf("Wprowadz linie tekstu\n"
				+ "zatwierdzaj ka�d� linie klawiszem enter\n"
				+ "aby wyj�� wpisz \"quit\"\n");
		
		int i;
		String line = "";
		
	for (i = 1; !"quit".equals(line); i++) {
			
			line = con.readLine("\n");
			//System.out.println(line);
			if (!"quit".equals(line)) con.printf(i + ". " + line);
		
	}
		}
		else System.out.println("nie polaczono z konsola");
	}
}
