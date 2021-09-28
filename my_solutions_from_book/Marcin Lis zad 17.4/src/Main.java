import Package1.*;
import Package2.*;
import Package3.*;


public class Main {

	public static void main(String[] args) {
		Package1.Punkt punkt1 = new Package1.Punkt();
		punkt1.ustawX(12);
		punkt1.ustawY(3);
		System.out.println("Wspolrzedne to: " + punkt1.pobierzX() + "," + punkt1.pobierzY());
		Package2.Punkt punkt2 = new Package2.Punkt();
		punkt2.ustawX(34);
		punkt2.ustawY(67);
		System.out.println("Wspolrzedne to: " + punkt2.pobierzX() + "," + punkt2.pobierzY());
		Package3.Punkt punkt3 = new Package3.Punkt();
		punkt3.ustawX(232);
		punkt3.ustawY(2423);
		System.out.println("Wspolrzedne to: " + punkt3.pobierzX() + "," + punkt3.pobierzY());
	}
	

}
