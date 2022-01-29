package Lec22;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		printpath(0, 0, m - 1, n - 1, "");// 3*4---> m*n

	}
	// cr = curr row
	// cc = curr col
	// er = end row
	// ec = end col

	public static void printpath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printpath(cr + 1, cc, er, ec, ans + "V");
		printpath(cr, cc + 1, er, ec, ans + "H");
		

	}

}
