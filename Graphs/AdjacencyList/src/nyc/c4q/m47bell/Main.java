package nyc.c4q.m47bell;

public class Main {

    public static Graph makeTestGraph(){

        Graph graph = new Graph();

        graph.addVertices("v1", "v2", "v3", "v4", "v5", "v6", "v7");
        graph.addDirectedEdge("v1", "v2", 2);
        graph.addDirectedEdge("v1", "v4", 1);
        graph.addDirectedEdge("v2", "v4", 3);
        graph.addDirectedEdge("v2", "v5", 10);
        graph.addDirectedEdge("v3", "v1", 4);
        graph.addDirectedEdge("v3", "v6", 5);
        graph.addDirectedEdge("v4", "v3", 2);
        graph.addDirectedEdge("v4", "v5", 2);
        graph.addDirectedEdge("v4", "v6", 8);
        graph.addDirectedEdge("v4", "v7", 4);
        graph.addDirectedEdge("v5", "v7", 6);
        graph.addDirectedEdge("v7", "v6", 1);
        return graph;

    }

    public static void main(String[] args) {

        Graph graph = makeTestGraph();
        System.out.println("# of vertices in graph: " + graph.size());
        System.out.println("cost from v1 to v2 : " + graph.getWeight("v1", "v2"));
        System.out.println("cost from v2 to v5 : " + graph.getWeight("v2", "v5"));
        System.out.println("cost from v1 to v5 : " + graph.getWeight("v1", "v5"));
        System.out.println("cost from v1 to v1 : " + graph.getWeight("v1", "v1"));
        System.out.println(graph.getNeighbors("v4"));
        System.out.println(graph.getNeighbors("v6"));
        System.out.println(graph.getNeighbors("v1"));
        System.out.println(graph.getNeighbors("v2"));
        System.out.println(graph.getNeighbors("v3"));

    }


}
