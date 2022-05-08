package Lec48;

import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int wt[] = new int[n];
		for (int i = 0; i < wt.length; i++) {
			wt[i] = sc.nextInt();
		}
		int[] val = new int[n];
		for (int i = 0; i < wt.length; i++) {
			val[i] = sc.nextInt();
		}
		System.out.println(Zero_1Knapsack(wt, val, c, 0));

	}

	public static int Zero_1Knapsack(int[] wt, int[] val, int c, int idx) {
		if (c == 0 || idx == wt.length) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if (c >= wt[idx]) {
			inc = Zero_1Knapsack(wt, val, c - wt[idx], idx + 1) + val[idx];
		}
		exc = Zero_1Knapsack(wt, val, c, idx + 1);
		
		return Math.max(inc, exc);
	}

}
