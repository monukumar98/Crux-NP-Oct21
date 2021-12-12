package Lec10;

public class Revrsal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7};
		RotateArray(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}
	 public static void RotateArray(int[] arr, int k) {
		 int n = arr.length;
		 k= k%n;
		 Reverseinrange(arr, n-k, arr.length-1);
		 Reverseinrange(arr, 0, n-k-1);
		 Reverseinrange(arr, 0, arr.length-1);

			

		}
	public static void Reverseinrange(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;

		}

	}


}
