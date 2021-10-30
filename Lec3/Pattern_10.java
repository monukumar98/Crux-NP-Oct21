package Lec3;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=2*n-1) {
			
			// Space
			
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			if(row<n) {
				nst++;
				nsp--;
				
			}
			else {
				nsp++;
				nst--;
			}
			System.out.println();
			row++;
			
			
			
			
		}

	}

}
