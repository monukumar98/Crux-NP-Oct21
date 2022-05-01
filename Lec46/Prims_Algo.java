package Lec46;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prims_Algo {

	public class Prims_Pair {

		int vtx;
		int acqvtx;
		int cost;

		public Prims_Pair(int v, int ac, int cost) {
			// TODO Auto-generated constructor stub
			this.acqvtx = ac;
			this.vtx = v;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqvtx + " @ " + this.cost;
		}

	}

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void primsalgo() {
		PriorityQueue<Prims_Pair> pq = new PriorityQueue<>(new Comparator<Prims_Pair>() {

			@Override
			public int compare(Prims_Pair o1, Prims_Pair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		int sum=0;
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new Prims_Pair(1, 1, 0));
		while (!pq.isEmpty()) {
			Prims_Pair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}

			//System.out.println(rp);
			sum+=rp.cost;

			visited.add(rp.vtx);

			for (int key : map.get(rp.vtx).keySet()) {

				if (!visited.contains(key)) {

					Prims_Pair np = new Prims_Pair(key, rp.vtx, map.get(rp.vtx).get(key));

					pq.add(np);
				}

			}

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Prims_Algo pp = new Prims_Algo(n);
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			pp.AddEdge(v1, v2, cost);

		}
		pp.primsalgo();
	}

}
