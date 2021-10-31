package Lec4;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp1 = 0;
		int nsp2 = n - 2;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp1) {
				System.out.print("  ");
				csp++;
			}

			System.out.print("* ");
			csp = 1;
			while (csp <= nsp2) {
				System.out.print("  ");
				csp++;
			}
			if (row != n / 2 + 1) {
				System.out.print("* ");
			}
			if (row <= n / 2) {
				nsp1++;
				nsp2 -= 2;
			} else {
				nsp1--;
				nsp2 += 2;
			}

			System.out.println();
			row++;

		}

	}

}
