package Lec11;

public class Print_All_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, -19, 11, -17, 4 };
		SUbarray(arr);

	}

	public static void SUbarray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
                     System.out.print(arr[k]+" ");
				}
				System.out.println();

			}

		}
	}

}
