package Lec8;

public class Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 371;
		System.out.println(ArmstrongNumbers(n));

	}
	

	public static boolean ArmstrongNumbers(int n) {

		int ans = 0;
		int count=countofdigit(n);
		int m=n;
		while (n > 0) {
			int rem = n%10;
			ans = (int) (ans + Math.pow(rem, count));
			n= n/10;
			

		}
		return m==ans;

	}

	public static int countofdigit(int n) {

		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;

	}

}
