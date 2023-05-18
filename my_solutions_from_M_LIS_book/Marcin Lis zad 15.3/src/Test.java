
public class Test {
	double zmiennoprzecinkowa;
	char znak;
	
	Test (double liczba) {
		zmiennoprzecinkowa = liczba;
	}
	Test (char znak) {
		this.znak = znak;
	}
	Test (double liczba, char znak) {
		this(liczba);
		this.znak = znak;
	}
	Test (char znak1, double liczba) {
		this (liczba);
		znak = znak1;
	}
}
