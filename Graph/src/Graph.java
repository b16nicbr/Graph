import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Graph {

	
	public static void addEdges(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for (int i =0;i<adj.size();i++) {
			System.out.println("Adjaceny list to vertex " + i);
			System.out.println("Head");
			for(int j = 0; j<adj.get(i).size();j++) {
				System.out.println(adj.get(i)+ " -> " + adj.get(i).get(j));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edge=5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(edge);
		for (int i = 0; i<edge;i++) {
			adj.add(new ArrayList<Integer>());
		}
		addEdges(adj,0,1);
		addEdges(adj,0,4);
		addEdges(adj,1,2);
		addEdges(adj,1,3);
		addEdges(adj,2,3);
		addEdges(adj,3,4);
		printGraph(adj);
	}

}
