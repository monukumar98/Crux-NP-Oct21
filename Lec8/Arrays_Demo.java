package Lec8;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int [5];
		
		System.out.println(arr[1]);
		
		int [] other = arr;
		int [] ar = new int [7];
		arr=ar;
		other = arr;
		
		System.out.println(arr.length);

	}

}
