package Lec43;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 1, 1, 2 };
		System.out.println(Singlenumber(arr));

	}

	public static int Singlenumber(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

}
