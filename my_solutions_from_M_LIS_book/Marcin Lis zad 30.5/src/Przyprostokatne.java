
public class Przyprostokatne {
	private double p1;
	private double p2;
	Przyprostokatne(double p1, double p2) {
		setPrzyprostokatne(p1,p2); 
		
	}
	public void setPrzyprostokatne(double p1, double p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public double przeciwprostokatna() {
		return Math.sqrt(p1 * p1 + p2 * p2);
	}
	public double przeciwprostokatna(Przeksztalcenia prz) {
		double p1 = prz.przeksztalc(this.p1);
		double p2 = prz.przeksztalc(this.p2);
		return Math.sqrt(p1*p1 + p2*p2);
	}
}
