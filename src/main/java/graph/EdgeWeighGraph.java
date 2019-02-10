package graph;

import java.util.HashSet;
import java.util.Set;

public class EdgeWeighGraph {

    private int V;            // 顶点总数
    private Set<Edge>[] adj;  // 邻接表


    public EdgeWeighGraph(int v) {
        this.V = v;
        adj = new Set[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new HashSet<>();
        }
    }


    public void addEdge(Edge edge) {
        adj[edge.getV()].add(edge);
        adj[edge.getW()].add(edge);
    }


    public int getV() {
        return V;
    }


    public Set<Edge> adj(int v) {
        return adj[v];
    }


    public Set<Edge> edges() {
        Set<Edge> edges = new HashSet<>();
        for (int i = 0; i < V; i++) {
            edges.addAll(adj[i]);
        }
        return edges;
    }
}
