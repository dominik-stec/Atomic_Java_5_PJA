
public class Punkt3D extends Punkt{
	int z;
	Punkt3D() {
		super();
		z = 1;
	}
	Punkt3D (int wspX, int wspY, int wspZ) {
		super(wspX, wspY);
		z = wspZ;
	}
	Punkt3D (Punkt3D punkt) {
		super (punkt);
		z = punkt.z;
	}
}
