package Lec48;

import java.util.*;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 90 };
		int dp[] = new int[arr.length];
		Arrays.fill(dp, -1);

		System.out.println(Robber(arr, 0, dp));

	}

	public static int Robber(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Robber(arr, i + 2, dp);
		int dontrob = Robber(arr, i + 1, dp);

		return dp[i] = Math.max(rob, dontrob);

	}

}
