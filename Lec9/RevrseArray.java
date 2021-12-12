package Lec9;

public class RevrseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 4, 2, 14, 55, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;

		}

	}

}
