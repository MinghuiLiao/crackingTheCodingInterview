import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import algorithms.Bag;

import com.algorithm.api.In;

//Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
public class crackingTheCodingInterview_08_04_02 {
	public class Graph {
		private final int V; //vertex number
		private int E; //number of edges
		private Bag<Integer>[] adj; //adjacency list
		public Graph(int V) {
			this.V = V;
			this.E = 0;
			adj = new Bag[V]; //create an adjacency list
			for (int v = 0; v < V; v++) {
				adj[v] = new Bag<Integer>();
			}
			
		}
		
		public Graph(In in) {
			this(in.readInt());
			int E = in.readInt();
			for (int i = 0; i < E; i++) {
				//add an edge
				int v = in.readInt(); //read a vertex
				int w = in.readInt(); //read another vertex
				addEdge(v, w);
			}
		}
		
		public int V() { return V; }
		public int E() { return E; }
		
		public void addEdge(int v, int w) {
			adj[v].add(w); //add w into v's linked list
			adj[w].add(v); //add v into w's linked list
			E++;
		}
		
		public Iterable<Integer> adj(int v) {
			return adj[v];
		}
		
	}
	
	Graph newGraph(int V) {
		Graph G = new Graph(V);
		return G;
	}
	
	public static class BreadthFirstSearch {
		static boolean[] marked; //if the shortest path to the vertex is known
		static int[] edgeTo; // the last point to the vertex of this path
		final  int s; //start point
		
		public BreadthFirstSearch(Graph G, int s) {
			marked = new boolean[G.V()];
			edgeTo = new int[G.V()];
			this.s = s;
			bfs(G, s);
		}	
		
		public void bfs(Graph G, int s) {
			Queue<Integer> queue = new LinkedList<Integer>();
			marked[s] = true; //mark the start point
			queue.add(s);
			while (!queue.isEmpty()) {
				int v = queue.remove();
				for (int w: G.adj(v)) {
					if (!marked[w]) {
						edgeTo[w] = v; //save the last edge of the shortest path
						marked[w] = true;
						queue.add(w);					
					}
				}
			}
		}
		
		public boolean search(Graph G, int start, int end) {
			Queue<Integer> queue = new LinkedList<Integer>();
			for (int v = 0; v < G.V; v++) {
				marked[v] = false; //mark all vertexes as unvisited
			}
			marked[s] = true; //mark the start point
			queue.add(s);
			int u;
			while (!queue.isEmpty()) {
				int v = queue.remove();
				
				for (int w: G.adj(v)) {
					if (!marked[w]) {
						if (w == end) {
							return true;
						} else {
							edgeTo[w] = v; //save the last edge of the shortest path
							marked[w] = true;
							queue.add(w);	
						}				
					}
				}
			}
			return false;
		}
		
		public boolean hasPathTo (int v) {
			return marked[v];
		}
		
		public Iterable<Integer> pathTo(int v) {
			if (!hasPathTo(v)) return null;
			Stack<Integer> path = new Stack<Integer>();
			for (int x = v; x != s; x = edgeTo[x]) {
				path.push(x);
			}
			path.push(s);
			return path;
		}
	}
	
	public static void main(String[] args) {
		crackingTheCodingInterview_08_04_02 a = new crackingTheCodingInterview_08_04_02();
		Graph G = a.newGraph(10);
	}

}
