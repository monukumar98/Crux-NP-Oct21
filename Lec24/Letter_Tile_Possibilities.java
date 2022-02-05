package Lec24;

public class Letter_Tile_Possibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAB";
		int[] frqa = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frqa[ch - 'A'] = frqa[ch - 'A'] + 1;

		}
		System.out.println(numTilePossibilities(frqa, ""));

	}

	public static int  numTilePossibilities(int[] freq, String ans) {

		int count=0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= 1) {
				char ch = (char) ('A' + i);
				freq[i]--;
				count= count+ numTilePossibilities(freq, ans + ch)+1;
				freq[i]++;
				
			}

		}
		return count;

	}

}
