package Lec49;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "monday";
		String word2 = "monkey";
		System.out.println(edit(word1, word2, 0, 0));

	}

	public static int edit(String s1, String s2, int i, int j) {
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}

		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = edit(s1, s2, i + 1, j + 1);
		} else {
			int ii = edit(s1, s2, i, j + 1);
			int dd = edit(s1, s2, i + 1, j);
			int rr = edit(s1, s2, i + 1, j + 1);
			ans = Math.min(ii, Math.min(dd, rr)) + 1;
		}
		return ans;

	}

}
