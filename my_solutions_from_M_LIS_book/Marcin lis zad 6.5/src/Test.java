
public class Test {

	public static void main(String[] args) {
	    int a = 55, b = 88;
	    
	    a+= (b-3 ^ 4 << 2 | 8 - b >>> 8*2) - (a&a-1);
	    
	    System.out.println(a);

	}

}
