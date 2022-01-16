package Lec19;

public class All_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 1, 4, 3, 3, 5, 6, 4, 7 };
		// AllOcc(arr, 3, 0);
		int[] a = Allocc_arr(arr, 3, 0, 0);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void AllOcc(int[] arr, int item, int i) {

		if (i == arr.length) {
			return;
		}
		if (arr[i] == item) {
			System.out.print(i + " ");

		}
		AllOcc(arr, item, i + 1);

	}

	public static int[] Allocc_arr(int[] arr, int item, int i, int count) {

		if (i == arr.length) {
			int[] ans = new int[count];
			return ans;
		}
		if (arr[i] == item) {

			int a[] = Allocc_arr(arr, item, i + 1, count + 1);
			a[count] = i;
			return a;

		} else {
			return Allocc_arr(arr, item, i + 1, count);
		}
	}
}
