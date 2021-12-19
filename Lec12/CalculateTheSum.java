package Lec12;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
					
		}
		int q = sc.nextInt();
		while(q>0) {
		int x = sc.nextInt();

		int[] brr = new int[arr.length];
		for (int i = 0; i < brr.length; i++) {

			int j = i - x;
			if(j<0) {
				j+=arr.length;
			}
			brr[i]=arr[i]+arr[j];
		}
		arr=brr;
		q--;
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}
		sum = sum%(1000000000+7);
		System.out.println(sum);

	}

}
