package Revision_class_1;

public class Climbing_Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("\n" + path(n, 0, ""));

	}

	public static int path(int dis, int curr, String ans) {

		if (curr == dis) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > dis) {
			return 0;
		}

//		int s1 = path(dis, curr + 1);
//		int s2 = path(dis, curr + 2);
//		int s3 = path(dis, curr + 3);
		int ways = 0;
		for (int steps = 1; steps <= 3; steps++) {
			ways = ways + path(dis, curr + steps, ans + steps);
		}
		return ways;
	}
}
