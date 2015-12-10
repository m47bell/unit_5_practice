package nyc.c4q.m47bell;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * 11/17/15
 * Access Code 2-1
 * source: cs.fit - Dijkstra Notes
 */
public class Dijkstra {

    public static int[] dijkstraAlgorithim(Graph graph, String start) {
        HashMap<String, Vertex> vertices_Dij = new HashMap<String, Vertex>(graph.getVertices());

        if (!vertices_Dij.containsKey(start))
            throw new NoSuchElementException("Graph does not contain this start vertex");

        int[] distance = new int[vertices_Dij.size()];// shortest path from start vertex
        int[] nextVertexPath = new int[vertices_Dij.size()]; //goes to next node
        boolean[] vertexVisited = new boolean[vertices_Dij.size()]; //store visited vertices


        Vertex startingPoint = vertices_Dij.get(start);

        for (int i = 0; i < distance.length; i++) {
            int nextVertex = minVertex(distance, vertexVisited);
            vertexVisited[nextVertex] = true;

            for (int j = 0; j < distance.length; j++) {

             //toDo: save vertices in next Vertexpath
                graph.getNeighbors(Integer.toString(j));
//                (graph.getWeight(Integer.toString(i), Integer.toString(i++)));
            }

        }

        return nextVertexPath;

    }

    private static int minVertex(int[] distance, boolean[] vertexVisited) {
        int minValue = -1;
        int maxValue = Integer.MAX_VALUE;
        for (int i = 0; i < distance.length; i++) {

            if (!vertexVisited[i] && distance[i] < maxValue) {
                minValue = i;
                maxValue = distance[i];
            }


        }
        return minValue;
    }


}
