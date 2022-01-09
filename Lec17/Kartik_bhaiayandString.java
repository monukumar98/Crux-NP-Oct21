package Lec17;

public class Kartik_bhaiayandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbaaabaa";
		int k = 2;
		int flip_a = stringlen(str, k, 'a');
		int flip_b = stringlen(str, k, 'b');
		
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int stringlen(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {

			// window grow
			if (str.charAt(ei) == ch) {
				flip++;
			}

			// winndow size km kro

			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;

			}

			// ans cal
			ans = Math.max(ans,(ei - si + 1));
			

			ei++;

		}
		return ans;

	}

}
