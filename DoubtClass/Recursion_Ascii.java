package DoubtClass;

import java.util.Scanner;

public class Recursion_Ascii {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		SubSeb(str, "");
		System.out.println();
		System.out.println(count);

	}

	public static void SubSeb(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		
		char ch = ques.charAt(0);
		SubSeb(ques.substring(1), ans);
		SubSeb(ques.substring(1), ans+ch);
		SubSeb(ques.substring(1), ans+(int)(ch));

	}

}
