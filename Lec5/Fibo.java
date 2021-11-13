package Lec5;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		int i=1;
		int a=0;
		int b=1;
		while(i<=n) {
			int c=b+a;
			a=b;
			b=c;
			
			i++;
		}
		System.out.println(a);
	}

}
