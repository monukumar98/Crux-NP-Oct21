package Lec26;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 12, 5, 6, 15,3, 9, 8 };
		QuickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void QuickSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}

		int pi = PivotIndex(arr, si, ei);
		QuickSort(arr, si, pi - 1);
		QuickSort(arr, pi + 1, ei);
	}

	public static int PivotIndex(int[] arr, int si, int ei) {
		int pi = si;
		int pe = arr[ei];

		for (int i = si; i < ei; i++) {
			if (arr[i] < pe) {
				int t = arr[i];
				arr[i] = arr[pi];
				arr[pi] = t;
				pi++;
			}

		}
		int t = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = t;

		return pi;
	}

}
