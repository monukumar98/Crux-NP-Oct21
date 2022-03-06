package Lec32;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 5, 6, 2, 3 };
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int i = 0;
		int ans = 0;
		while (i < arr.length) {
			if (st.isEmpty() || arr[st.peek()] < arr[i]) {
				st.push(i);
				i++;
			}

			else {
				int ht = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					ans = Math.max(ans, ht * r);
				} else {
					int l = st.peek();
					ans = Math.max(ans, ht * (r - l - 1));

				}
			}

		}

		int r = i;
		while (!st.isEmpty()) {
			int ht = arr[st.pop()];

			if (st.isEmpty()) {
				ans = Math.max(ans, ht * r);
			} else {
				int l = st.peek();
				ans = Math.max(ans, ht * (r - l - 1));

			}
		}
		return ans;

	}

}
