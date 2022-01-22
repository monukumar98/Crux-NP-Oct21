package Lec20;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		GenerateParentheses(n, "", 0, 0);
		List<String> ll = new ArrayList<>();
		GenerateParenthes_list(n, "", 0, 0, ll);
		System.out.println();
		System.out.println(ll);

	}

	public static void GenerateParentheses(int n, String ans, int open, int close) {
		// TODO Auto-generated method stub
		if (open == n && close == n) {
			System.out.print(ans + " ");
			return;
		}

		if (open < n) {
			GenerateParentheses(n, ans + "(", open + 1, close);
		}

		if (close < open) {
			GenerateParentheses(n, ans + ")", open, close + 1);
		}

	}

	public static void GenerateParenthes_list(int n, String ans, int open, int close, List<String> list) {
		// TODO Auto-generated method stub
		if (open == n && close == n) {
			// System.out.print(ans + " ");
			list.add(ans);
			return;
		}

		if (open < n) {
			GenerateParenthes_list(n, ans + "(", open + 1, close, list);
		}

		if (close < open) {
			GenerateParenthes_list(n, ans + ")", open, close + 1, list);
		}

	}

}
