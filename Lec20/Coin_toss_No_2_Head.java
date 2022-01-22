package Lec20;

public class Coin_toss_No_2_Head {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		CoinToss(n, "");
		System.out.println();
		System.out.println(count);

	}

	public static void CoinToss(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {

			CoinToss(n - 1, ans + "H");

		}
		CoinToss(n - 1, ans + "T");

	}

	public static int CoinToss_Count(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {

			return 1;
		}
		int head = 0;
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {

			head = CoinToss_Count(n - 1, ans + "H");

		}
		int tail = CoinToss_Count(n - 1, ans + "T");
		return head + tail;

	}

}
