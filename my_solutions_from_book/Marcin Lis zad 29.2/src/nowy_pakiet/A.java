package nowy_pakiet;

public class A {
	class B {
		int liczba;
	}
	private B obiektB = new B();
	public int odczyt() {
		return obiektB.liczba;
	}
	public void zapis (int liczba) {
		obiektB.liczba = liczba;
	}
}
