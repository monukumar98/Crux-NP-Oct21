package Lec2;

import java.util.Scanner;

public class Count_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		while(n>0) {
			count=count+1;
			n=n/10;
		}
		System.out.println(count);

	}

}
