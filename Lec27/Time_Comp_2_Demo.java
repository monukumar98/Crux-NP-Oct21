package Lec27;

public class Time_Comp_2_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("hello");
		int n = 99009;
		for (int i = 0; i < n; i++) {
			System.out.println("hello");
		}

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(1)
			i++;
		}

		while (i < n) {
			System.out.println("Hey");

			i *= 2;
			// (Log N))
		}

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// (Log N))
		}

		while (i <= n) {
			System.out.println("Hey");

			i += 2;
			i += 3;
			// O(N)
		}

		while (i <= n) {
			System.out.println("Hey");

			i *= 2;
			i *= 3;
			// log n base 6
		}

		while (n > 0) {
			System.out.println("Hey");

			n /= 2;
			n /= 3;
			//log n base 6
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				// O(N^2)
			}
		}
		
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}
		
		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
			// log N
		}
		
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
					//N^2 log n
				}
			}
		}
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
				// nlog n
			}
		}

	}

}
