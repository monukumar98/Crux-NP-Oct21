package Revision_class_1;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println("\n" + print(str, ""));

	}

	private static int print(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		char ch = ques.charAt(0);
		int fs = print(ques.substring(1), ans);
		int ss = print(ques.substring(1), ans + ch);
		return fs + ss;

	}

}
