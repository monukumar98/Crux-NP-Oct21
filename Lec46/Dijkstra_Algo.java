package Lec46;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {

	public class Dijkstra_Pair {

		int vtx;
		String path;
		int cost;

		public Dijkstra_Pair(int v, String path, int cost) {
			// TODO Auto-generated constructor stub
			this.path = path;
			this.vtx = v;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.path + " @ " + this.cost;
		}

	}

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void dijkstraalgo() {
		PriorityQueue<Dijkstra_Pair> pq = new PriorityQueue<>(new Comparator<Dijkstra_Pair>() {

			@Override
			public int compare(Dijkstra_Pair o1, Dijkstra_Pair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});

		HashSet<Integer> visited = new HashSet<>();
		pq.add(new Dijkstra_Pair(1, "1", 0));
		while (!pq.isEmpty()) {
			Dijkstra_Pair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}

			System.out.println(rp);

			visited.add(rp.vtx);

			for (int key : map.get(rp.vtx).keySet()) {

				if (!visited.contains(key)) {

					Dijkstra_Pair np = new Dijkstra_Pair(key, rp.path + key, rp.cost + map.get(rp.vtx).get(key));

					pq.add(np);
				}

			}

		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);
		pa.addEdge(1, 2, 2);
		pa.addEdge(2, 3, 3);
		pa.addEdge(1, 4, 10);
		pa.addEdge(4, 5, 8);
		pa.addEdge(3, 4, 1);
		pa.addEdge(5, 6, 5);
		pa.addEdge(5, 7, 6);
		pa.addEdge(6, 7, 4);
		pa.dijkstraalgo();

	}

}
