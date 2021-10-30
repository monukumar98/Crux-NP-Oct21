package Lec3;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = 0;
		int nst = n;
		int row = 1;
		while (row <= n) {
			// Space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			// Star
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nsp++;
			nst--;

		}

	}

}
