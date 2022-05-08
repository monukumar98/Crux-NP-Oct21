package Lec48;

public class Climbing_Stairs {
	public static void main(String[] args) {
		int n = 8;
		int[] dp = new int[n + 1];
		System.out.println(fiboTD(n, dp));

	}

	public static int fiboTD(int n, int[] dp) {
		if (n == 0 || n == 1) {

			return 1;
		}
		// Dp Apply
		if (dp[n] != 0) {
			return dp[n];
		}

		int f1 = fiboTD(n - 1, dp);
		int f2 = fiboTD(n - 2, dp);
		return dp[n] = f1 + f2;// Rem

	}
}
