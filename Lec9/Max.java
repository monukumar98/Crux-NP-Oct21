package Lec9;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,3,4,2,4,55,8,9};
		System.out.println(max(arr));

	}
	
	public static int max(int []arr) {
		
		int max_value=Integer.MIN_VALUE;//-2^31
	    for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max_value) {
				max_value=arr[i];
			}
		}
	    return max_value;
	}

}
