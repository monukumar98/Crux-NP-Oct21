package Revision_class_1;

public class Subset_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		int target = 3;
		System.out.println("\n"+print(arr, 0, "", 0, target));
	}

	private static int print(int[] arr, int sum, String ans, int i, int target) {
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				return 1;
			}
			return 0;
		}

		int fs = print(arr, sum + arr[i], ans + arr[i] + " ", i + 1, target);
		int ss = print(arr, sum, ans, i+1, target);
		return fs + ss;
	}

}
