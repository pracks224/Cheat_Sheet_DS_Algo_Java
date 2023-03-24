package Graph;

import java.util.ArrayList;

public class PrintGraphUsingEdge {
    private static final int V = 5;
    private static ArrayList<Edge> adj = new ArrayList<>();
    private static ArrayList<Edge> trn = new ArrayList<>();

    public void addEdge(Edge edge, boolean choice) {
        if (!choice) adj.add(edge);
        else trn.add(edge);
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            Edge e = adj.get(i);
            System.out.println(e.soure + "   " + e.dest);
        }
    }

    public static void main(String[] args) {
        for(int i =0;i<V;i++){
          //  ArrayList<Edge>
        }
        PrintGraphUsingEdge graph = new PrintGraphUsingEdge();
        Edge one = new Edge(0, 1);
        Edge two = new Edge(0, 2);
        Edge three = new Edge(1, 2);
        Edge four = new Edge(2, 3);
        graph.addEdge(one, true);
        graph.addEdge(two, true);
        graph.addEdge(three, true);
        graph.addEdge(four, true);
        graph.printGraph();
    }
}

class Edge {
    int soure;
    int dest;

    public Edge(int soure, int dest) {
        this.soure = soure;
        this.dest = dest;
    }
}
