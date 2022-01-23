package Lec21;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcda";
		print_permuataion(str, "");

	}

	public static void print_permuataion(String ques, String ans) {// abcde
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {// i=1 abde ch -->c
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			print_permuataion(ros, ans + ch);

		}

	}

}
