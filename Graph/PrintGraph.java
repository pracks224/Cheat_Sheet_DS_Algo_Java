package Graph;

import java.util.ArrayList;

//Using Array
public class PrintGraph {
    private static int V = 5;
    private static ArrayList<Integer>[] adj = new ArrayList[V];
    private static ArrayList<Integer>[] trn = new ArrayList[V];

    public void addEdge(int source, int dest, boolean choice) {
        if (!choice)
            adj[source].add(dest);
        else
            adj[source].add(dest);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.println(i + "------->");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.println(adj[i].get(j) + " ");
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < V; i++)
        {
            adj[i] = new ArrayList<Integer>();
            trn[i] = new ArrayList<Integer>();
        }
        PrintGraph graph = new PrintGraph();
        graph.addEdge(0, 1, true);
        graph.addEdge(0, 2, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(2, 3, true);
        graph.printGraph();
    }


}
