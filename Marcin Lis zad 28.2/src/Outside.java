
public class Outside {
	public Inside ins = new Inside();
	class Inside {
		Inside2 ins2 = new Inside2();
		private int liczba = 100;
		public void f() {
			System.out.println ("Inside:f liczba = " + liczba);
		}
		public class Inside2 {
			public void zmien(int nowa_liczba) {
				liczba = nowa_liczba;
		}
		}
	}
}
