package Lec27;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		System.out.println(isprime(37));

	}

	public static boolean isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
