package Lec14;

public class String_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="hellobyeokay";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		String ans="";
//		System.out.println(ans);
//		for (int i = 4; i <=7; i++) {
//			ans= ans+str.charAt(i);
//			
//		}
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 5));
		
		System.out.println(str.indexOf('l'));

	}

}
