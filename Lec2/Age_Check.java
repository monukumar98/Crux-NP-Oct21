package Lec2;

import java.util.Scanner;

public class Age_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("hey");
		}
		if(age<16) {
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}

	}

}
