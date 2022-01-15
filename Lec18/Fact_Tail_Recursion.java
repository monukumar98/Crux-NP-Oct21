package Lec18;

public class Fact_Tail_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5, 1));

	}

	public static int fact(int n,int ans) {
		if(n==0) {
			return ans;
		}
		
		
		return fact(n-1, ans*n);
		

	}

}
