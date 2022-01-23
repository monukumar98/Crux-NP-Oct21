package Lec21;

public class Comapre_Two_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="cabgh";
		String s2="cabf";
//		if(CompareTo(s1, s2)>0) {
//			System.out.println(s1);
//		}
//		else {
//			System.out.println(s2);
//		}
		if(s1.compareTo(s2)>0) {
			System.out.println(s1);
		}
		else {
			System.out.println(s2);
		}
		

	}
	public static int CompareTo(String s1, String s2) {
		int i=0;
		int j=0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)>s2.charAt(j)) {
				return 1;
			}
			else if(s1.charAt(i)<s2.charAt(j)) {
				return -1;
			}
			else {
				i++;
				j++;
			}
			
		}
		return s1.length()-s2.length();
		
	}
}
