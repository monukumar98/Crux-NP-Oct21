package Lec4;

public class Pattren_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(row+"\t");
				cst++;
			}

			nsp--;
			nst += 2;
			row++;
			System.out.println();
		}

	}

}
