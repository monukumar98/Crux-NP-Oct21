package Lec22;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		TOH(n, "T1", "T3", "T2");

	}

	public static void TOH(int n, String src, String help, String dis) {
		if (n == 0) {
			return;
		}

		TOH(n - 1, src, dis, help);
		System.out.println("Move " + n + "th" + " from " + src + " to " + dis);
		TOH(n - 1, help, src, dis);

	}

}
