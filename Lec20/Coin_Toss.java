package Lec20;

public class Coin_Toss {
	static int count = 0;

	public static void main(String[] args) {
		int n = 3;
		CoinToss(n, "");
		System.out.println(count);

	}

	public static void CoinToss(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans);
			count++;
			return;
		}

		CoinToss(n - 1, ans + "H");
		CoinToss(n - 1, ans + "T");

	}

//	public static int CoinToss_Count(int n, String ans) {
//		// TODO Auto-generated method stub
//		if (n == 0) {
//			return 1;
//		}
//
//		int head= CoinToss_Count(n - 1, ans + "H");
//		int tail= CoinToss_Count(n - 1, ans + "T");
//		return head+tail;
//		
//		
//
//	}
}
