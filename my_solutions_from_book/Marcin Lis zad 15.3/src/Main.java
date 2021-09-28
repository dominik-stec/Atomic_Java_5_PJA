
public class Main {

	public static void main(String[] args) {
		Test konstruktory1 = new Test ('s');
		Test konstruktory2 = new Test (2.3);
		Test konstruktory3 = new Test ('f', 4.2);
		Test konstruktory4 = new Test (1.7, 'k');
		
		System.out.println (konstruktory1.zmiennoprzecinkowa + " " + konstruktory1.znak);
		System.out.println (konstruktory2.zmiennoprzecinkowa + " " + konstruktory2.znak);
		System.out.println (konstruktory3.zmiennoprzecinkowa + " " + konstruktory3.znak);
		System.out.println (konstruktory4.zmiennoprzecinkowa + " " + konstruktory4.znak);
	}

}
