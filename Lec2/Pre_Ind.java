package Lec2;

public class Pre_Ind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=90;
		int b= ++a;// a= a+1;
		System.out.println(b);
		
		int x=8;
		x=x+ ++a;
		System.out.println(x);
		System.out.println(b++);
		
		x= x+ ++a +b++;
		System.out.println(x);

	}

}
