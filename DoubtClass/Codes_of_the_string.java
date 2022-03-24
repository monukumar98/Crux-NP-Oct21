package DoubtClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Codes_of_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list = new ArrayList<>();
		Codes_string(str, "",list);
		System.out.println(list);
	}

	public static void Codes_string(String ques, String ans,ArrayList<String> list) {
		if (ques.length() == 0) {
			list.add(ans);
			return;
		}
		String r = ques.substring(0, 1);// 1
		char ch = (char) (96 + Integer.parseInt(r));
		Codes_string(ques.substring(1), ans + ch,list);
		if (ques.length() >= 2) {
			String r1 = ques.substring(0, 2);// 1
			if (Integer.parseInt(r1) <= 26) {
				ch = (char) (96 + Integer.parseInt(r1));
				Codes_string(ques.substring(2), ans + ch,list);
			}
		}
	}
}
