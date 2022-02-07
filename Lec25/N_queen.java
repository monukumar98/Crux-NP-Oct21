package Lec25;

public class N_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		boolean[][] board = new boolean[n][n];
		NQueen(board, n, 0);

	}

	public static void NQueen(boolean[][] board, int tq, int row) {// tq--> total Queen
		if (tq == 0) {
			display(board);
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = true;
				NQueen(board, tq - 1, row + 1);
				board[row][col] = false;
			}

		}

	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// vertical
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}

		// left Diagonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;

		}

		// right Diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

	public static void display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("----------------------");

	}

}
