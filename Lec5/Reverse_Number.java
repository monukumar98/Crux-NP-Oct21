package Lec5;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 87639;
		int ans=0;
		while(n!=0) {
			int rem = n%10;
			ans = ans*10 +rem;
			n=n/10;
		}
		System.out.println(ans);
		
		

	}

}
