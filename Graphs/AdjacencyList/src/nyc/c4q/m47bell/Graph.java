package nyc.c4q.m47bell;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by c4q-marbella on 11/15/15.
 * Access Code 2-1
 * Marbella Vidals
 */

//using map instead of lists to optimize solution,
// if you use a list of edges and an edge class, it becomes wasteful
// (an extra object being created by java)
public class Graph {

    static Map<String, Vertex> vertices;

    public Graph() {
        this.vertices = new HashMap<String, Vertex>();
    }

    public static Map<String, Vertex> getVertices() {

        return vertices;
    }

    public int size() {

        return vertices.size();

    }

    public void addVertices(String... names) {
        for (String name : names) {
            addVertex(name);
        }
    }

    public void addVertex(String name) {
        vertices.put(name, new Vertex(name));
    }

    public void addUndirectedEdge(String from, String to, int weight) {
        addDirectedEdge(from, to, weight);
        addDirectedEdge(to, from, weight);
    }

    public void addDirectedEdge(String from, String to, int weight) {

        Vertex v1 = vertices.get(from);

        Vertex v2 = vertices.get(to);

        if (v1 == null || v2 == null) {
            System.out.println("not found");
        } else {
            v1.neighbors.put(v2, weight);
        }
    }

    public int getWeight(String from, String to) {
        Vertex v1 = vertices.get(from);

        Vertex v2 = vertices.get(to);

        if (v1 == null || v2 == null)
            return -1;
        Integer weight = v1.neighbors.get(v2);

        if (weight == null)
            return Integer.MAX_VALUE;
        return weight;

    }

    public Set<Vertex> getNeighbors(String name) {
        Vertex v = vertices.get(name);
        if (v == null)
            return Collections.emptySet();
        return v.getNeighbors();
    }
}
