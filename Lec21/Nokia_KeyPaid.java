package Lec21;

public class Nokia_KeyPaid {

	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "198";
		//System.out.println();
		kpc(str, "");

	}

	public static void kpc(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = ques.charAt(0);// char
		String keyString = key[ch-48];// abc
		for (int i = 0; i < keyString.length(); i++) {
			kpc(ques.substring(1), ans+keyString.charAt(i));

		}

	}

}
