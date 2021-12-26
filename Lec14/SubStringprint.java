package Lec14;

import java.util.Scanner;

public class SubStringprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		PrintSubtring(str);

	}
	public static void PrintSubtring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
				
				
			}
			
		}
	}

}
