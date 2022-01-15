package Lec18;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 3, 3, 5, 6, 4,7 };
		int item = 7;
		System.out.println(FirstOcc(arr, item, 0));

	}

	public static int FirstOcc(int[] arr, int item, int i) {

		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}
		return FirstOcc(arr, item, i + 1);

	}

}
