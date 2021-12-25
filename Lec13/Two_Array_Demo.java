package Lec13;

public class Two_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr=new int [3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][1]);
		//int [] [] other = arr;
		int row= arr.length;
		int col=arr[0].length;
		arr[2][1]=90;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}
