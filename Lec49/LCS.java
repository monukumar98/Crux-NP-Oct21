package Lec49;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abced";
		String s2 = "ace";
		int[][] dp = new int[s1.length()][s2.length()];
		System.out.println(lcs(s1, s2, 0, 0, dp));

	}

	public static int lcs(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		 if(dp[i][j]!=0) {
			 return dp[i][j];
		 }
		
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1, dp);
		} else {
			int fs = lcs(s1, s2, i + 1, j, dp);
			int ss = lcs(s1, s2, i, j + 1, dp);
			ans = Math.max(fs, ss);
		}
		return dp[i][j] = ans;

	}

}
