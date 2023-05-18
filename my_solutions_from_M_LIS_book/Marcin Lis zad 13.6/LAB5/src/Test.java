public class Test
{
	public static void main(String[] args){
		Telefon tel_Ala = new Telefon("783982331");
		Telefon tel_Ola = new Telefon("608234982");
		tel_Ala.zadzwon("0124239832");
		tel_Ala.zadzwon("2342575678");
		tel_Ala.zadzwon("6644675465");
		tel_Ola.zadzwon("112");
		double kwota = tel_Ala.obliczKwoteDoZaplaty();
		System.out.println("Ala ma do zapłaty: " + kwota + " zl.");
		tel_Ala.pokazWybieraneNumery();
	}
}
