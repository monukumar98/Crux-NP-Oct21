package Lec18;

public class Facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

	public static int fact(int n) {
		// base case
		if (n == 0) {
			return 1;
		}
		// sp
		int fn = fact(n - 1);
		return n*fn;// sp + sw

	}

}
