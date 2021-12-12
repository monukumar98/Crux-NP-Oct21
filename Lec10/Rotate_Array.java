package Lec10;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		RotateArray(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void RotateArray(int[] arr, int k) {

		k = k % arr.length;
		for (int r = 1; r <= k; r++) {

			int lv = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];

			}
			arr[0] = lv;
		}

	}

}
