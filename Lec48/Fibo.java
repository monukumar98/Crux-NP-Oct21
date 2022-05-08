package Lec48;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		int[] dp = new int[n + 1];
		//System.out.println(fibo(n));
		System.out.println(fiboTD(n, dp));

	}

	public static int fibo(int n) {
		if (n == 0 || n == 1) {

			return n;
		}

		int f1 = fibo(n - 1);
		int f2 = fibo(n - 2);
		return f1 + f2;

	}

	public static int fiboTD(int n, int[] dp) {
		if (n == 0 || n == 1) {

			return n;
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
