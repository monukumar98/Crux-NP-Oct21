package Lec17;

public class Next_Greater_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 9, 7, 6, 1 };
		nextPermutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void nextPermutation(int[] arr) {

		int p = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}

		}
		int q = 0;

		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}

		}
		if (p == 0 && q == 0) {
			Reverseinrange(arr, 0, arr.length - 1);
			return;
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Reverseinrange(arr, p + 1, arr.length - 1);

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
