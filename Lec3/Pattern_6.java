package Lec3;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nst = 1;
		int nsp = n - 1;// number of space
		int row = 1;

		while (row <= n) {

			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			nsp--;
			nst++;
			row++;

		}

	}

}
