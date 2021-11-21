package Lec8;

public class Count_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6787;
		int count = countofdigit(n);
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
