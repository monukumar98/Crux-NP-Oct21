package Lec43;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkoddeven(89);

	}
	public static void checkoddeven(int a) {
		
		
		if((a&1)!=0) {
			System.out.println("odd_number");
		}
		else {
			System.out.println("even_number");
		}
	}

}
