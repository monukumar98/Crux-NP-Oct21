package Lec9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 4, 2, 14, 55, 8, 9 };
		System.out.println(linearsearch(arr, 155));

	}

	public static int linearsearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
			
		}
		return -1;

	}

}
