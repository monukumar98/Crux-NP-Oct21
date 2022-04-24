package Lec44;

public class SubSeqSunce_UsingBitmaksing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		print(str);

	}

	public static void print(String s) {

		for (int i = 0; i < 1 << s.length(); i++) {
			printpattern(s, i);
		}

	}

	private static void printpattern(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i != 0) {

			if ((i & 1) != 0) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i = i >> 1;
		}
		System.out.println();

	}

}
