package Lec27;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		isprime(n);

	}

	public static void isprime(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// not prime
		prime[1] = true;// not prime
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == false) {
				for (int mul = 2; i * mul < prime.length; mul++) {
					prime[i * mul] = true;
				}
			}

		}
		
		
		for (int i = 0; i < prime.length; i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
		}

	}

}
