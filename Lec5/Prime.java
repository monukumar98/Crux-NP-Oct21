package Lec5;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		int fact=0;
		while(i<n) {
			if(n%i==0) {
				fact++;//fact=fact+1;
				break;
			}
			i++;
		}
		if(fact==0) {
			System.out.println("Prime");
		}
		else {
		System.out.println("Not Prime");
		}

	}

}
