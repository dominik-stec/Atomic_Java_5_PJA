
public class Punkt3D extends Punkt{
	int z;
	/*
	void ustawXYZ () {
		x = 1;
		y = 1;
		z = 1;
	}
	*/
	void ustawXYZ (int wspX, int wspY, int wspZ) {
		x = wspX;
		y = wspY;
		z = wspZ;
	}
	/*
	void ustawXYZ (Punkt3D punkt) {
		x = punkt.x;
		y = punkt.y;
		z = punkt.z;
	}
	Punkt3D() {
		Punkt3D punkt = new Punkt3D();
		punkt.ustawXYZ();
	}
	Punkt3D(int wspX, int wspY, int wspZ) {
		Punkt3D punkt = new Punkt3D();
		punkt.ustawXYZ(wspX, wspY, wspZ);
	}
	Punkt3D (Punkt3D punkt2) {
		Punkt3D punkt = new Punkt3D();
		punkt.ustawXYZ(punkt2);
	}
	*/
	Punkt3D(){
		this.ustawXYZ(1, 1, 1);
	}
	Punkt3D(int wspX, int wspY,int wspZ) {
		this.ustawXYZ(wspX, wspY, wspZ);
	}
	Punkt3D(Punkt3D punkt) {
		this.ustawXYZ(punkt.x, punkt.y, punkt.z);
	}
	
}
