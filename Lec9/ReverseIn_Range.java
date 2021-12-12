package Lec9;

public class ReverseIn_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 4, 2, 14, 55, 8, 9 };
		Reverseinrange(arr, 2, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void Reverseinrange(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;

		}

	}

}
