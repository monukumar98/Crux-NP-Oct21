package DoubtClass;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();// number of rickshaws
			int m = sc.nextInt();// number of Cab
			int[] rickshaw = new int[n];
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw[i] = sc.nextInt();
			}
			int[] cab = new int[m];
			for (int i = 0; i < cab.length; i++) {
				cab[i] = sc.nextInt();
			}
			System.out.println(minCost(rickshaw, cab, c1, c2, c3, c4));

		}

	}

	public static int minCost(int[] rickshaw, int[] cab, int c1, int c2, int c3, int c4) {

		int cr=0;
		int ca=0;
		for (int i = 0; i < rickshaw.length; i++) {
			cr = cr + Math.min(rickshaw[i]*c1, c2);
			
		}
		cr = Math.min(cr, c3);
		
		for (int i = 0; i < cab.length; i++) {
			ca = ca + Math.min(cab[i]*c1, c2);
			
		}
		ca = Math.min(ca, c3);
		cr = ca +cr;
		return Math.min(c4, cr);
		
		
	}

}
