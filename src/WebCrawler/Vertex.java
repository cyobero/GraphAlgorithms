package WebCrawler;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private Vertex previousVertex;
    private List<Vertex> adjacencies;

    public Vertex(String name) {
        this.name = name;
        this.adjacencies = new ArrayList<>();  // prevennt null pointer exception
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public List<Vertex> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(List<Vertex> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public void addNeighbor(Vertex vertex) {
        this.adjacencies.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
