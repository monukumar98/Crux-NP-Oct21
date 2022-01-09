package Lec16;

public class CbNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "81615";
		GenrateCBNumber(str);

	}

	public static void GenrateCBNumber(String str) {
		int count = 0;
		boolean [] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si + len <= str.length(); si++) {
				int ei = len + si;
				String s = str.substring(si, ei);
				long num = Long.parseLong(s);// string to long
				// Integer.parseInt(s) //String to Int
				if (isCbnumber(num)==true && isvisited(visited, si, ei-1)==true) {
					for (int i = si; i <ei; i++) {
						visited[i]=true;
					}
					count++;
				}

			}

		}
		System.out.println(count);

	}
	public static boolean isvisited(boolean [] visited, int si , int ei) {
		for (int i = si; i <=ei; i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
		
	}

	public static boolean isCbnumber(long n) {

		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
