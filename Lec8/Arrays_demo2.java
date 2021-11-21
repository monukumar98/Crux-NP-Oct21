package Lec8;

public class Arrays_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr  = new int [5];
		
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
		// set
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(i+1)*10;
			
		}
		
		// get
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		
		for (int i =arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("E__F___L");
		
		
		for(int val:arr) {
			System.out.print(val+" ");
		}

	}

}
