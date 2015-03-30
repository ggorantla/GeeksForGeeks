package Graphs;

/**
 * Created by ggorantla on 3/29/2015.
 */
public class TestGraph {
    public static void main(String[] args) {
        Graph testingGraph = new Graph(3);

        testingGraph.addEdge(0,1);
        testingGraph.addEdge(0,2);
        
        testingGraph.printGraph();
        System.out.println(testingGraph);
    }
}
