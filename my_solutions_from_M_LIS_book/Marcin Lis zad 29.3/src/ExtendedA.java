
public class ExtendedA extends A {
	A a = new A();
	A.B b = a.new B();
	//lub poprostu 
	//B b = new B();
	int pole1 = b.pole;
}
