
public class Main {

	public static void main(String[] args) {
		MojaKlasa obj = new MojaKlasa();
		obj.setLiczba(1);
		System.out.println(obj);
		int temp1 = obj.getLiczba();
		System.out.println(obj);
		int temp2 = obj.setAndGet(2);
		System.out.println(obj);
		
		PierwszyInterfejs pi = new MojaKlasa();
		pi.setLiczba(3);
		System.out.println(pi);
		int temp3 = pi.getLiczba();
		System.out.println(pi);
	}

}
