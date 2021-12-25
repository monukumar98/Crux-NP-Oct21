package Lec13;

public class TransPose_ofSqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	}

	public static void transpose(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {
				int t = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = t;

			}

		}
	}
}
