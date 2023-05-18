
public class Main {

	public static void main(String[] args) {
		
		try{
			Punkt punkt = new Punkt();
			Punkt3D punkt3D = (Punkt3D) punkt;
			punkt3D.z = 10;
		}
		catch(ClassCastException e) {
			System.out.println("Nieprawidlowe rzutowanie i przypisanie");
			System.out.println("Tworze obiekt punkt3d klasy Punkt3D i przypisuje zmiennej z tego obiektu wartosc 10");
			Punkt3D punkt3D = new Punkt3D();
			punkt3D.z = 10;
		}
	}

}
