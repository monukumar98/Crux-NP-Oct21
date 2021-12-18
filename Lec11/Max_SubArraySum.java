package Lec11;

public class Max_SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, -19, 11, -17, 4 };
		System.out.println(SUbarray(arr));

	}
	public static int SUbarray(int[] arr) {
         int maxsum=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum=0;
				for (int k = i; k <= j; k++) {
                     sum+=arr[k];
				}
				maxsum=Math.max(maxsum, sum);
			}

		}
		return maxsum;
	}

}
