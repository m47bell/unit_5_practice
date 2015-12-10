package nyc.c4q.m47bell;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by c4q-marbella on 11/15/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class Vertex {
    String name;
    Map<Vertex, Integer> neighbors;

    public Vertex(String name) {
        this.name = name;
        this.neighbors = new HashMap<Vertex, Integer>();
    }

    public Set<Vertex> getNeighbors() {
        return this.neighbors.keySet();
    }

    @Override
    public String toString() {
        return name;
    }
}
