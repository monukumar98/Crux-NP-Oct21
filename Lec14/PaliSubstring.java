package Lec14;

public class PaliSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		PrintSubtring(str);

	}
	public static void PrintSubtring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String ans= str.substring(i, j);
				if(isPaliString(ans)==true) {
					System.out.println(ans);
				}
				
				
			}
			
		}
	}
	public  static boolean isPaliString(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
