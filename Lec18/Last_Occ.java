package Lec18;

public class Last_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3,1, 4, 3, 3, 5, 6, 4, 7 };
		// 
		int item = 1;
		System.out.println(LAstOcc(arr, item, arr.length - 1));

	}

	public static int LAstOcc(int[] arr, int item, int i) {

		if (i <0) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}
		return LAstOcc(arr, item, i - 1);

	}
}
