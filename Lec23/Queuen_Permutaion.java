package Lec23;

public class Queuen_Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		QueenPermutaion(board, tq, 0, "");
		

	}

	public static void QueenPermutaion(boolean[] board, int tq, int qpsf, String ans) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;

				QueenPermutaion(board, tq, qpsf+1, ans + "b" + i + "q" + qpsf);
				board[i] = false;

			}

		}

	}

}
