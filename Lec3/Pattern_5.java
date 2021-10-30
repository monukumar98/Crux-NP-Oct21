package Lec3;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nst = 2*n-1;
		
		int row=1;
		while(row<=n) {
			
			int cst =1;
			
			while(cst<=nst) {
				
				System.out.print("* ");
				cst++;
			}
			
			row++;
			System.out.println();
			nst-=2;
		}
		

	}

}
