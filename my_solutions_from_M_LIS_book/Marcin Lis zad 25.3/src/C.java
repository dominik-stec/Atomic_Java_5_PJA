
public class C {
	// kolejno�� wykonywania kodu jest istotna/ mo�na zmieni� kolejno�� wykonywania kodu albo umie�ci� utworzenie obiekt�w w konstruktorze C 
	A obiektA = new A();
	B obiektB = new B();
	public C() {
		System.out.println("Konstruktor klasy C");
		A obiektA = new A();
		B obiektB = new B();
	}
}
