package Lec14;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String st1 = "hello";
		System.out.println(str);
		System.out.println(st1);
		String s1 = new String("hello");
		str=str+"bye";
		System.out.println(str);
		String s2 = new String("hello");
		str=str.concat("okay");
		System.out.println(str);

	}

}
