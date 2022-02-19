package Lec26;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 7, 5, 1, 12, 3 };
		arr=MergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static int[] MergeSort(int[] arr, int si, int ei) {
		if(si==ei) {
			int [] bs = new int [1];
			bs[0]=arr[si];
			return bs;
		}

		int mid = (si + ei) / 2;
		int[] fa = MergeSort(arr, si, mid);
		int[] sa = MergeSort(arr, mid + 1, ei);
		return mergetwoSortedArray(fa, sa);

	}

	public static int[] mergetwoSortedArray(int[] arr, int[] arr1) {
		int n = arr.length;
		int m = arr1.length;
		int[] ans = new int[n + m];

		int i = 0;// arr
		int j = 0;// arr1
		int k = 0;// ans
		while (i < n && j < m) {
			if (arr[i] < arr1[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = arr1[j];
				j++;
				k++;
			}
		}

		while (i < n) {
			ans[k] = arr[i];
			i++;
			k++;
		}

		while (j < m) {
			ans[k] = arr1[j];
			j++;
			k++;
		}

		return ans;
	}

}
