package DoubtClass;

import java.util.Scanner;

public class Subset_problem {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		PrintSubSet(arr, 0, "", 0, target);
		System.out.println();
		System.out.println(count);

	}

	public static void PrintSubSet(int[] arr, int i, String ans, int sum, int target) {

		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				count++;

			}
			return;
		}

		PrintSubSet(arr, i + 1, ans + arr[i] + " ", sum + arr[i], target);
		PrintSubSet(arr, i + 1, ans, sum, target);

	}

}
