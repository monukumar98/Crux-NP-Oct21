package Lec25;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		Sudoku(arr, 0, 0);

	}

	public static void Sudoku(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			display(arr);
			return;
		}

		if (arr[row][col] != 0) {
			Sudoku(arr, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (issafe(arr, row, col, val) == true) {

					arr[row][col] = val;
					Sudoku(arr, row, col + 1);
					arr[row][col] = 0;
				}

			}
		}

	}

	public static boolean issafe(int[][] arr, int row, int col, int val) {
		// TODO Auto-generated method stub
		// check col
		int r = 0;
		while (r < 9) {
			if (arr[r][col] == val) {
				return false;
			}
			r++;
		}
		// check row

		int c = 0;
		while (c < 9) {
			if (arr[row][c] == val) {
				return false;
			}
			c++;
		}

		// 3*3 matrix
		r = row - row % 3;
		c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}

		}

		return true;
	}

	public static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("------------------------------------");

	}

}
