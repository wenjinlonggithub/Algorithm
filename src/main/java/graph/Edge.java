package graph;

public class Edge {

    private int v;           // 顶点
    private int w;           // 另一个顶点
    private double weight;   // 权值


    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }


    public int getV() {
        return v;
    }


    public int getW() {
        return w;
    }


    public double getWeight() {
        return weight;
    }
    

    public int getOther(int vertex) {
        return vertex ^ (v ^ w);
    }
}
