package Lec6;

public class Dec_to_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=67;
		// src=10;
		// dis=2;
		int ans=0;
		int mul=1;
		while(n>0) {
			int rem = n%2;
			ans = ans + rem*mul;
			n/=2;// n = n/2;
			mul= mul*10;
			
			
			
		}
		System.out.println(ans);

	}

}
