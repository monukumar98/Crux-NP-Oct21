package Lec45;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
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

	public int noofedge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();
		}
		return sum / 2;
	}

	public boolean ContainsEdge(int v1, int v2) {

		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public void addvertx(int v) {
		map.put(v, new HashMap<>());
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);

		}
	}

	public void removeVertx(int v) {
		for (int key : map.get(v).keySet()) {
			map.get(key).remove(v);
		}
		map.remove(v);
	}

	public void Display() {
		for (int key : map.keySet()) {

			System.out.println(key + " --> " + map.get(key));
		}
	}

	public boolean HashPath(int src, int dis, HashSet<Integer> visited) {
		if (src == dis) {
			return true;
		}
		visited.add(src);
		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				boolean path = HashPath(key, dis, visited);
				if (path == true) {
					return true;
				}
			}
		}
		return false;
	}

	public void PrintallPath(int src, int dis, HashSet<Integer> visited, String ans) {

		if (src == dis) {
			System.out.println(ans + dis);
			return;
		}
		visited.add(src);
		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				PrintallPath(key, dis, visited, ans + src);

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int dis) {

		LinkedList<Integer> queue = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		queue.add(src);
		while (!queue.isEmpty()) {
			// remove
			int rv = queue.remove();

			// Ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}

			// dis
			if (rv == dis) {
				return true;
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

		return false;

	}

	public boolean DFS(int src, int dis) {

		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			// remove
			int rv = st.pop();

			// Ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}

			// dis
			if (rv == dis) {
				return true;
			}

			// visited
			visited.add(rv);

			// nbrs add

			for (int key : map.get(rv).keySet()) {
				if (!visited.contains(key)) {
					st.push(key);
				}
			}

		}

		return false;

	}

	public void BFT() {
		LinkedList<Integer> queue = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			queue.add(src);
			while (!queue.isEmpty()) {
				// remove
				int rv = queue.remove();

				// Ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}

				// print
				System.out.print(rv);

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
		System.out.println();

	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int rv = st.pop();

				// Ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}

				// print
				System.out.print(rv);

				// visited
				visited.add(rv);

				// nbrs add

				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						st.push(key);
					}
				}

			}
		}
		System.out.println();

	}

	public boolean iscycle() {
		LinkedList<Integer> queue = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			queue.add(src);
			while (!queue.isEmpty()) {
				// remove
				int rv = queue.remove();

				// Ignore if already visited
				if (visited.contains(rv)) {
					return true;
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
		return false;

	}

}
