package Lec3;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1;
		int nst=1;// number of star
		while(row<=n) {
			
			int cst=1;// count of star
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			//next row Prep
			System.out.println();
			row++;
			nst++;
			
			
		}

	}

}
