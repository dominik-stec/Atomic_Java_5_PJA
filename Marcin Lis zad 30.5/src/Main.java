
public class Main {

	public static void main(String[] args) {
		Przyprostokatne p = new Przyprostokatne(3,4);
		System.out.println(p.przeciwprostokatna(
				new Przeksztalcenia() {
					public double przeksztalc(double arg) {
						return arg - 1;
					}
				}
			)
			);
	}

}
