package Lec8;

public class Print_Armstrong_Number {

	public static void main(String[] args) {

	}
	public static void printArmstrongNumbers(int n1, int n2) {
		for (int i = n1; i <=n2; i++) {
			if(ArmstrongNumbers(i)==true) {
				System.out.println(i);
			}
			
		}
		
		
	}
	
	public static boolean ArmstrongNumbers(int n) {

		int ans = 0;
		int count=countofdigit(n);
		int m=n;
		while (n > 0) {
			int rem = n%10;
			ans = (int) (ans + Math.pow(rem, count));
			n= n/10;
			

		}
		return m==ans;

	}

	public static int countofdigit(int n) {

		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;

	}

}
