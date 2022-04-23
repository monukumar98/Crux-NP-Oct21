package Lec43;

public class Check_Ith_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 64;
		int i = 2;
		System.out.println(isset(n, i));

	}

	public static boolean isset(int n, int i) {

		n >>= i;// n= n>>i;
		if ((n & 1) != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isset2(int n, int i) {
		int mask = 1 << i;
		if ((n & mask) == 0) {
			return true;
		} else {
			return false;
		}

	}

}
