package Lec46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph_2 {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void count_Componenet() {
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
					continue;
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
		System.out.println(count);

	}

	public ArrayList<ArrayList<Integer>> GetAllCompnent() {
		LinkedList<Integer> queue = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			ArrayList<Integer> ll = new ArrayList<>();
			queue.add(src);
			while (!queue.isEmpty()) {
				// remove
				int rv = queue.remove();

				// Ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				ll.add(rv);

				// visited
				visited.add(rv);

				// nbrs add

				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						queue.add(key);
					}
				}

			}
			ans.add(ll);
		}
		return ans;

	}

}
