package Lec44;

import java.util.*;

public class Tavas_and_Saddas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(TavasandSaddas(s));

	}

	public static int TavasandSaddas(String s) {

		int count = (1 << s.length()) - 2;
		int pos = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) == '7') {
				count += (1 << pos);
			}
			pos++;

		}
		return count + 1;

	}

}
