
public class Punkt3D extends Punkt {
	int z;
	void ustawZ(int wspZ) {
		z = wspZ;
	}
	int pobierzZ() {
		return z;
	}
	void ustawXYZ(int wspX, int wspY, int wspZ) {
		x = wspX;
		y = wspY;
		z = wspZ;
	}
	void ustawXZ (int wspX, int wspZ) {
		x = wspX;
		z = wspZ;
	}
	void ustawYZ (int wspY, int wspZ) {
		y = wspY;
		z = wspZ;
	}

}
