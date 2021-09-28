
public class PaczkaNazwa extends Paczka{
	private String nazwa;
	private String cel;
	
	public PaczkaNazwa (String nazwa, String cel, int dlugosc, int szerokosc, int wysokosc,
			int wartosc) {
		super(dlugosc, szerokosc, wysokosc, wartosc);
		this.nazwa = nazwa;
		this.cel = cel;
		}

	public int ObliczObj() {
		int obj;
		if (super.ObliczPodst() >= 10000) return obj = 1000000;
		else return super.ObliczObj();
	}
	public String PodajIdent() {
		String nazwaCel = nazwa + " ma byc dostarczona do: " + cel;
		return nazwaCel;
	}
}
