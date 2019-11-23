package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbors;

    public Vertex(int data) {
        this.data = data;
        this.neighbors = new ArrayList<>();  // prevents null pointer exception
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    public void addNeighbor(Vertex neighbor) {
        this.neighbors.add(neighbor);
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}
