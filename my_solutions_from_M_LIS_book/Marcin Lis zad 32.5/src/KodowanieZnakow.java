import java.io.*;

public class KodowanieZnakow {
	public static PrintWriter koduj() {
	PrintWriter outp = null;
	try {
		outp = new PrintWriter(
				new OutputStreamWriter(System.out, "Cp852"), true
				);
	}
	catch(UnsupportedEncodingException e) {
		System.out.println("Nie mozna ustawic strony kodowej Cp852.");
		outp = new PrintWriter(new OutputStreamWriter(System.out), true);
	}
	return outp;
	}
}
