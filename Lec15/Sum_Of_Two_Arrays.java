package Lec15;

import java.util.ArrayList;
import java.util.Collections;

public class Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 0, 2, 9 };
		int[] arr2 = { 3, 4, 5, 6, 7 };
		SumOfTwoArrays(arr1, arr2);

	}

	public static void SumOfTwoArrays(int[] arr1, int[] arr2) {

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = 0;

			if (i >= 0) {
				sum += arr1[i];
				i--;
			}
			if (j >= 0) {
				sum += arr2[j];
				j--;
			}
			sum += carry;
			list.add(0, sum % 10);
			carry = sum / 10;
		}
		if (carry != 0) {
			list.add(0, carry);
		}
		System.out.println(list);
		Collections.reverse(list);

		System.out.println(list);

	}

}
