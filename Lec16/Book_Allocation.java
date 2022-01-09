package Lec16;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt();
		int nos = sc.nextInt();
		int[] book = new int[nob];
		for (int i = 0; i < book.length; i++) {
			book[i]=sc.nextInt();
		}
		System.out.println(noofpage(book, nos));

	}

	public static int noofpage(int[] book, int nos) {

		int lo = 0;
		int hi = 0;
		for (int i = 0; i < book.length; i++) {
			hi += book[i];
		}
		
		int ans = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			if (isitpossible(book, nos, mid)) {
				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;
			}
		}
return ans;
	}

	public static boolean isitpossible(int[] book, int nos, int mid) {
		// TODO Auto-generated method stub

		int student = 1;
		int readpages = 0;
		int i = 0;
		while (i < book.length) {
			if (readpages + book[i] <= mid) {
				readpages += book[i];
				i++;
			} else {
				student++;
				readpages = 0;
			}
			if (student > nos) {
				return false;
			}

		}

		return true;
	}

}
