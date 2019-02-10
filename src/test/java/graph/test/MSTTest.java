package graph.test;

import graph.*;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class MSTTest {

    private EdgeWeighGraph graph;

    private Set<Edge> expect;


    @org.junit.Before
    public void data() {

        Edge edge1 = new Edge(0, 1, 1.0);
        Edge edge2 = new Edge(1, 2, 2.0);
        Edge edge3 = new Edge(2, 3, 3.0);
        Edge edge4 = new Edge(3, 0, 4.0);
        Edge edge5 = new Edge(0, 2, 5.0);

        graph = new EdgeWeighGraph(4);
        graph.addEdge(edge1);
        graph.addEdge(edge2);
        graph.addEdge(edge3);
        graph.addEdge(edge4);
        graph.addEdge(edge5);

        expect = new HashSet<>();
        expect.add(edge1);
        expect.add(edge2);
        expect.add(edge3);
    }


    @org.junit.Test
    public void testPrimMST() {
        test(new PrimMST(graph));
    }


    @org.junit.Test
    public void testKruskalMST() {
        test(new KruskalMST(graph));
    }


    private void test(MST mst) {

        Set<Edge> result = mst.getResult();
        Assert.assertEquals(result.size(), expect.size());

        for (Edge edge : result) {
            Assert.assertTrue(expect.contains(edge));
            expect.remove(edge);
        }
    }

}