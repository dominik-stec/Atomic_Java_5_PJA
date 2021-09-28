
public class C {
	// kolejnoœæ wykonywania kodu jest istotna/ mo¿na zmieniæ kolejnoœæ wykonywania kodu albo umieœciæ utworzenie obiektów w konstruktorze C 
	A obiektA = new A();
	B obiektB = new B();
	public C() {
		System.out.println("Konstruktor klasy C");
		A obiektA = new A();
		B obiektB = new B();
	}
}
