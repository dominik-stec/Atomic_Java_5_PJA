
public class NoweOpakowanie extends Opakowanie {
	int liczba;
	int pobierzWartosc (boolean bool) {
		if (bool) return liczba;
		else return super.liczba;
		}
	void ustawWartosc(int x, boolean bool) {
		if (bool) liczba = x;
		else super.liczba = x;
	}
}

