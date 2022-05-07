package Lec47;

import java.util.*;

import Lec47.Is_Graph_Bipartite.Bipartite;

public class Is_Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
			for (int i = 0; i < graph.length; i++) {
				map.put(i, new HashMap<Integer, Integer>());

			}

			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph[i].length; j++) {
					map.get(i).put(graph[i][j], 1);

				}

			}

			LinkedList<Bipartite> queue = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();

			for (int src : map.keySet()) {
				if (visited.containsKey(src)) {
					continue;
				}

				Bipartite bp = new Bipartite();
				bp.vtx = src;
				bp.lv = 0;

				queue.add(bp);
				while (!queue.isEmpty()) {
					// remove
					Bipartite rv = queue.remove();

					// Ignore if already visited
					if (visited.containsKey(rv.vtx) && rv.lv != visited.get(rv.vtx)) {
						return false;
					}

					// visited
					visited.put(rv.vtx, rv.lv);

					// nbrs add

					for (int key : map.get(rv.vtx).keySet()) {
						if (!visited.containsKey(key)) {
							Bipartite nbp = new Bipartite();
							nbp.vtx = key;
							nbp.lv = rv.lv + 1;
							queue.add(nbp);
						}
					}

				}

			}
			return true;

		}

	}

	public class Bipartite {
		int vtx;
		int lv;
	}

}
