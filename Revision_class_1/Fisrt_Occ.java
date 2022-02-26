package Revision_class_1;

public class Fisrt_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 4, 5, 8, 1, 1, 9 };
		System.out.println(First_Occ(arr, 0, 1));

	}

	public static int First_Occ(int[] arr, int i, int item) {

		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}

		return First_Occ(arr, i + 1, item);

	}

}
