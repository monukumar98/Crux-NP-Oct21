package Lec8;

public class Any_to_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sb = 5;
		int num = 21043;
		int db = 8;
		int newnum = Any_to_10(sb, num);
		System.out.println(newnum);
		System.out.println(Dec_to_Any(db, newnum));

	}

	public static int Any_to_10(int sb, int num) {

		int ans = 0;
		int mul = 1;
		while (num > 0) {
			int rem = num % 10;
			ans = ans + rem * mul;
			mul = mul * sb;
			num = num / 10;

		}
		return ans;

	}
	
	public static int Dec_to_Any(int db, int num) {
		
		int ans = 0;
		int mul = 1;
		while (num > 0) {
			int rem = num % db;
			ans = ans + rem * mul;
			mul = mul * 10;
			num = num / db;

		}
		return ans;
		
		
		
	}

}
