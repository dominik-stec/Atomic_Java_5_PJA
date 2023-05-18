
public class Test {

	public static void main(String[] args) {
		int [][][] tab = new int [2][3][5];
		int i, j, k;
		int L = 30;
		for (i=0; i<tab.length; i++){
			for (j=0; j<tab[i].length; j++){
				for (k=0; k<tab[i][j].length; k++) {
					tab[i][j][k] = L++;
				}
			}
		}
		for(i=0;i<tab.length;i++){
			for(j=0;j<tab[i].length;j++){
				for(k=0;k<tab[i][j].length;k++){
					System.out.println("tab[" + i + "]" + "[" +j + "]" + "[" + k + "] = " + tab[i][j][k]);
				}
			}
		}
	}

}
