package Lec18;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 9;
		System.out.println(pow(a, b));
	}

	public static int pow(int a, int b) {
		if (b == 1) {
			return a;
		}

		int p = pow(a, b - 1);
		return a * p;

	}

}
