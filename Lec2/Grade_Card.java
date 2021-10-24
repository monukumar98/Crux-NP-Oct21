package Lec2;

import java.util.Scanner;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks= sc.nextInt();
		if(marks>=70) {
			System.out.println("Grade A");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("Grade C");
		}
		else if(marks>=40 && marks<50) {
			System.out.println("Grade D");
		}
		else if(marks>=30 && marks<40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("hey");

	}

}
