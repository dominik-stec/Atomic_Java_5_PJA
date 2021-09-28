package package1;
import package2.Punkt3D;

public class Main {

	public static void main(String[] args) {
		Punkt3D punkt = new Punkt3D();
		// blad kompilacji - zmienna jest potected punkt.x = 3;
		punkt.z = 3;
		
		// j.w. package2.Punkt.x = 2;
		
	}

}
