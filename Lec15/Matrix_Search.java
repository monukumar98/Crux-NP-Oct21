package Lec15;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 30, 38 }, { 2, 52, 54 }, { 7, 60, 69 } };

	}

	public static int Search(int[][] arr, int item) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {

			if (arr[row][col] == item) {
				return 1;
			} else if (arr[row][col] < item) {
				row++;
			} else {
				col--;
			}
		}
		return 0;

	}

}
