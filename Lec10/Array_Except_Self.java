package Lec10;

public class Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,5,4};
		ProductofArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void ProductofArray(int[] arr) {
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		left[0] = 1;
		for (int i = 1; i < right.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		right[arr.length - 1] = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < right.length; i++) {
			arr[i] = left[i] * right[i];
		}

	}

}
