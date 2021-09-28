
public class Outside {
	public Inside ins = new Inside();
	public void zmien(int nowa_liczba) {
		ins.liczba = nowa_liczba;
	}
	class Inside {
		private int liczba = 100;
		public void f() {
			System.out.println("Inside:f liczba = " + liczba);
		}
	}
}
