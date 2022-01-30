package Lec23;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		QueenCombination(board, tq, 0, "",0);

	}

	public static void QueenCombination(boolean[] board, int tq, int qpsf, String ans,int indx) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = indx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;

				QueenCombination(board, tq, qpsf+1, ans + "b" + i + "q" + qpsf,i+1);
				board[i] = false;

			}

		}

	}

}
