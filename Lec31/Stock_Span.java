package Lec31;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 15, 11, 9, 13, 21, 3 };
		Sapn(arr);

	}

	public static void Sapn(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();

			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		
		
		

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
