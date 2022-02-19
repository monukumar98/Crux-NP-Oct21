package Lec26;

public class Merge_Two_SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 4, 5, 6, 7, 11, 13 };
		int[] arr1 = { 2, 3, 4, 5, 6, 7, 16 };
		int ans[]=mergetwoSortedArray(arr, arr1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
			
		}

	}

	public static int[] mergetwoSortedArray(int[] arr, int[] arr1) {
		int n = arr.length;
		int m = arr1.length;
		int[] ans = new int[n + m];

		int i = 0;//arr
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
