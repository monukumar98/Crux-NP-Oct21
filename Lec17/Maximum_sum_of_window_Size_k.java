package Lec17;

public class Maximum_sum_of_window_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,5,7,15,1,5,7};
		int k=3;
		System.out.println(maxsum(arr, k));

	}
	public static int maxsum(int []arr,int k) {
		int sum=0;
		int ans=0;
		for (int i = 0; i <k; i++) {
			sum+=arr[i];
			
		}
		
		ans=sum;
		for (int i = k; i < arr.length; i++) {
			sum+=arr[i];
			sum-=arr[i-k];
		
			ans=Math.max(ans, sum);
			
		}
		
		return ans;
	}

}
