package Lec43;

public class Single_Number_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 2, 5 };

	}

	public static void Number_II(int[] arr) {
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {

			ans = ans ^ arr[i];
		}
		int mask = (ans & (~(ans - 1)));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]&mask)!=0) {
				a^=arr[i];
			}
			
		}
		
		int b = ans^a;

	}

}
