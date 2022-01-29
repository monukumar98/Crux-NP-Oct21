package Lec22;

public class Lexico_counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lexixocounting(0, 1000);
	}

	public static void lexixocounting(int curr, int end) {
		// TODO Auto-generated method stub
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			lexixocounting(curr * 10 + i, end);
		}

	}

}
