package Lec32;

import java.util.Stack;

public class Find_the_Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, 
				       { 1, 0, 1, 1 }, 
				       { 0, 0, 0, 0 }, 
				       { 1, 1, 1, 0 } };
		System.out.println(celebrityProblem(arr));

	}

	private static int celebrityProblem(int[][] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 0) {
				st.push(a);
			} else {
				st.push(b);
			}
		}
		int candidate = st.pop();
		
		for (int i = 0; i < arr.length; i++) {
			if (i != candidate && ((arr[candidate][i] == 1) || arr[i][candidate] == 0)) {
				
				return -1;
			}

		}
		return candidate;

	}

}
