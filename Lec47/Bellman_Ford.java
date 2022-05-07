package Lec47;

import java.util.*;

public class Bellman_Ford {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Bellman_Ford(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	public class EdgePair {
		int v1;
		int v2;
		int cost;

		public EdgePair(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub

			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

	}

	public ArrayList<EdgePair> getalledge() {
		ArrayList<EdgePair> list = new ArrayList<>();
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				EdgePair ed = new EdgePair(v1, v2, map.get(v1).get(v2));
				list.add(ed);

			}

		}
		return list;

	}

	public void BellmanFord() {

		int v = map.size();
		int[] dis = new int[v + 1];
		Arrays.fill(dis, 1000000);
		ArrayList<EdgePair> ll = getalledge();
		dis[1] = 0;
		for (int i = 1; i <= v; i++) {

			for (EdgePair e : ll) {

				int old = dis[e.v2];
				int nv = dis[e.v1] + e.cost;
				if (nv < old) {
					if (i == v) {

						System.out.println("_ve wt ka Cycle h");
						return;

					}
					dis[e.v2] = nv;
				}

			}

		}
		for (int i = 1; i < dis.length; i++) {
			System.out.println(dis[i]);

		}
	}

	public static void main(String[] args) {
		Bellman_Ford bf = new Bellman_Ford(5);
		bf.addEdge(1, 2, 8);
		bf.addEdge(1, 3, 4);
		bf.addEdge(1, 4, 5);
		bf.addEdge(2, 5, -2);
		bf.addEdge(5, 2, -1);
		bf.addEdge(3, 4, -3);
		bf.addEdge(4, 5, 4);
		bf.BellmanFord();
	}

}
