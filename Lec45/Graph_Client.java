package Lec45;

import java.util.*;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addedge(1, 4, 5);
		g.addedge(1, 2, 10);
		g.addedge(2, 3, 7);
		g.addedge(3, 4, 2);
		g.addedge(4, 5, 4);
		g.addedge(5, 6, 3);
		g.addedge(5, 7, 2);
		g.addedge(6, 7, 7);
		// g.Display();
		// System.out.println(g.HashPath(1, 6, new HashSet<>()));
		// g.PrintallPath(1, 6, new HashSet<>(), "");
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));
		g.BFT();
		g.DFT();
		System.out.println(g.iscycle());

	}

}
