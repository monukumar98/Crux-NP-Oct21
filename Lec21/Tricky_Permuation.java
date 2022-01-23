package Lec21;

public class Tricky_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_permuataion("abca", "");

	}

	public static void print_permuataion(String ques, String ans) {// abcde
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {// i=1 abde ch -->c
			char ch = ques.charAt(i);
			boolean ispresent = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					ispresent = true;
					break;
				}

			}
			if (ispresent == false) {
				String ros = ques.substring(0, i) + ques.substring(i + 1);
				print_permuataion(ros, ans + ch);
			}

		}

	}

}
