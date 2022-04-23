package Lec43;

public class CountSet_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		System.out.println(countsetbit(n));
		System.out.println(countsetbitfast(n));

	}

	public static int countsetbit(int n) {

		int c = 0;
		while (n != 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n >>= 1;
		}
		return c;
	}
	
	public static int countsetbitfast(int n) {

		int c = 0;
		while (n != 0) {
			c++;
			n = (n&(n-1));
		}
		return c;
	}

}
