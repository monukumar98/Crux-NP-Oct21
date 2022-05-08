package Lec48;

import java.util.Arrays;

public class Coin_Change_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 3, 5, 7, 9 };
		int amount = 10;
		int[][] dp = new int[amount + 1][coins.length];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				dp[i][j] = -1;
//			}
//
//		}
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(CoinChanges(coins, amount, 0, dp));

	}

	public static int CoinChanges(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;

		}
		if (idx == coin.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[amount][idx];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coin[idx]) {
			inc = CoinChanges(coin, amount - coin[idx], idx, dp);
		}
		exc = CoinChanges(coin, amount, idx + 1, dp);
		return dp[amount][idx] = inc + exc;

	}

}
