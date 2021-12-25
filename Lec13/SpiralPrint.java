package Lec13;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		Print(arr);

	}

	public static void Print(int[][] arr) {
		int minc = 0;
		int maxc = arr[0].length - 1;
		int minr = 0;
		int maxr = arr.length - 1;
		int count = 0;
		int total = arr.length * arr[0].length;
		while (count < total) {
			for (int c = minc; c <= maxc && count < total; c++) {
				System.out.print(arr[minr][c] + " ");
				count++;

			}
			minr++;
			for (int r = minr; r <= maxr && count < total; r++) {
				System.out.print(arr[r][maxc] + " ");
				count++;

			}
			maxc--;

			for (int c = maxc; c >= minc && count < total; c--) {
				System.out.print(arr[maxr][c] + " ");
				count++;
			}
			maxr--;
			for (int r = maxr; r >= minr && count < total; r--) {
				System.out.print(arr[r][minc] + " ");
				count++;

			}
			minc++;
		}

	}

}
