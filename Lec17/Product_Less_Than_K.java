package Lec17;

public class Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int k = 10;
		System.out.println(numSubarrayProductLessThanK(arr, k));

	}

	public static int numSubarrayProductLessThanK(int[] arr, int k) {
		int ans = 0;
		int si = 0;
		int ei = 0;
		int mul = 1;
		while (ei < arr.length) {
			mul *= arr[ei];// window me  new ele add hua

			// mul>=k

			while (mul >= k && si <= ei) {
				mul /= arr[si];
				si++;

			}

			ans += (ei - si + 1);// wimdow size
			ei++;
		}
		return ans;
	}

}
