package Lec19;

public class Climbing_Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(No_of_Ways(0, n));
		print_path(0, n, "");

	}

	public static int No_of_Ways(int curr, int dis) {

		if (curr == dis) {
			return 1;
		}
		if (curr > dis) {
			return 0;
		}

//		int s1 = No_of_Ways(curr + 1, dis);
//		int s2 = No_of_Ways(curr + 2, dis);
//		int s3 = No_of_Ways(curr + 3, dis);
		int ans = 0;
		for (int step = 1; step <= 3; step++) {
			ans += (No_of_Ways(curr + step, dis));
		}
		return ans;

	}
	
	
	public static void print_path(int curr, int dis,String ans) {

		if (curr == dis) {
			System.out.println(ans);
			return ;
		}
		if (curr > dis) {
			return ;
		}

//		int s1 = No_of_Ways(curr + 1, dis);
//		int s2 = No_of_Ways(curr + 2, dis);
//		int s3 = No_of_Ways(curr + 3, dis);
	
		for (int step = 1; step <= 3; step++) {
			print_path(curr + step, dis,ans+step);
		}

	}
	
	

}
