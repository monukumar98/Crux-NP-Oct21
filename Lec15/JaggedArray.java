package Lec15;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int [] [] arr = new int [row][];
	
//		System.out.println(arr[0]);
//		System.out.println(arr[0].length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enetrt col of "+i+"th row");
			int col = sc.nextInt();
			arr[i]=new int [col];
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}
