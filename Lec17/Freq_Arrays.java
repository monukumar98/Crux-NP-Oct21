package Lec17;

public class Freq_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "akjaskajlddsjsdkzjansjdnwqjnekzzsdkwertyuioplkjhfgdacvxbnm";

		int[] frq = new int[26];
		Freq_Count(str, frq);
		for (int i = 0; i < frq.length; i++) {
			System.out.print(frq[i]+" ");
			
		}

	}

	public static void Freq_Count(String str, int[] frq) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frq[ch - 'a'] = frq[ch - 'a'] + 1;// frq[ch-97]++;

		}

	}

}
