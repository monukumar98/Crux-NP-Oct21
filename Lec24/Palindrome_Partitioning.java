package Lec24;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		PalindromePartitioning(str, list, ans);
		System.out.println(ans);

	}

	public static void PalindromePartitioning(String ques, List<String> list, List<List<String>> ans) {
		if (ques.length() == 0) {
			// System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String ros = ques.substring(0, i);
			if (isPalindromeString(ros) == true) {
				list.add(ros);
				PalindromePartitioning(ques.substring(i), list, ans);
				list.remove(list.size() - 1);
			}
		}

	}

	public static void Partitioning(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String ros = ques.substring(0, i);

			Partitioning(ques.substring(i), ans + ros + "|");

		}

	}

	public static boolean isPalindromeString(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
