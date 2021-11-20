package Lec7;

public class Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 9;
		System.out.println(a+" "+b);// 7 and 9
		Swap(a, b);
		System.out.println(a+" "+b);// 9 and  7

	}

	public static void Swap(int a, int b) {

		int t = a;
		a = b;
		b = t;
	}

}
