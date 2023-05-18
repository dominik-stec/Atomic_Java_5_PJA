
public class TelefonKomorkowy extends Telefon {
	String operator;
	void wyswlijSms (String sms) {
		System.out.println("SMS od: " + super.pokazNumer());
		System.out.println ("WIADOMOSC:");
		System.out.println (sms);
	}
	
}
