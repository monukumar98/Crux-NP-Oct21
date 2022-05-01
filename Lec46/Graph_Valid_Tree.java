package Lec46;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph_Valid_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {

			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new HashMap<>());
			}
			for (int[] a : edges) {
				int v1 = a[0];
				int v2 = a[1];
				map.get(v1).put(v2, 1);
				map.get(v2).put(v1, 1);
			}

			LinkedList<Integer> queue = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}

				count++;
				
				queue.add(src);
				while (!queue.isEmpty()) {
					// remove
					int rv = queue.remove();

					// Ignore if already visited
					if (visited.contains(rv)) {
						return false;
					}

					// visited
					visited.add(rv);

					// nbrs add

					for (int key : map.get(rv).keySet()) {
						if (!visited.contains(key)) {
							queue.add(key);
						}
					}

				}

			}
			return count == 1;

		}
	}
}
