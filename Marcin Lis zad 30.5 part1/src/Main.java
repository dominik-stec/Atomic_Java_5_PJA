
public class Main {

	public static void main(String[] args) {
		//Przyprostokatne p = new Przyprostokatne(3,4);
		System.out.println(new Przyprostokatne(3,4).przeciwprostokatna(
				(double arg) -> {
					return arg - 1;
				}
				
			)
			);
	}

}
