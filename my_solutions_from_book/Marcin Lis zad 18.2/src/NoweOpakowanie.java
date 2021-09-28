
public class NoweOpakowanie extends Opakowanie {
	int liczba;
	int pobierzWartosc (boolean bool) {
		if (bool) return liczba;
		else return super.liczba;
		}
	}

