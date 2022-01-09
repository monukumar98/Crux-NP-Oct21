package Lec16;

import java.util.*;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {

			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);// 1 2 4 8 9
			System.out.println(largestmindistance(stall, noc));
			t--;
		}
	}

	public static int largestmindistance(int[] stall, int noc) {
		int lo = 0;
		int hi = stall[stall.length - 1] - stall[0];// 9-1
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(stall, noc, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		return ans;

	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		// TODO Auto-generated method stub
		int cow = 1;
		int place = stall[0];
		int i = 1;
		while (i < stall.length) {

			if (stall[i] - place >= mid) {
				cow++;
				place = stall[i];
			}
			i++;
			if (cow == noc) {
				return true;
			}

		}

		return false;
	}

}
