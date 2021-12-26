package Lec14;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String st1 = "hello";
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1==str);
		System.out.println(str==st1);
		System.out.println(s1.equals(s2));


	}

}
