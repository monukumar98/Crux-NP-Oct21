package Lec15;

public class StringBulider_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("hello");
		sb.append("bye");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
//		sb.append("hellobye");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
//		sb.append('a');
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
//		sb.append("hellobyehellobyeaa");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
//		System.out.println(sb);
//		System.out.println(sb.charAt(2));
//		System.out.println(sb.reverse());
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		String st=sb.toString();// Builder to String
		StringBuilder sb1= new StringBuilder("hello");//
		
		//Stringprint();
		//StrinBuildrgprint();

	}
	public static void Stringprint() {
		String str="";
		for (int i = 0; i <10000; i++) {
			str=str+i;
		}
		System.out.println(str);
		
	}
	
	public static void StrinBuildrgprint() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <10000; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}
	
	

}
