package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph<T> {

    protected Set<Vertex<T>> vertices;

    // Constructor for Graph.
    protected Graph () {
        this.vertices = new HashSet<Vertex<T>>();
    }

    /*
        PRIVATE CLASSES
     */


    // Vertex class that holds Node data for the graph and a set of edges that are connected to the vertex.
    protected class Vertex<T> {


        protected T data;

        protected Set<Edge> neighbors;

        protected Vertex (T data) {
            this.data = data;
            this.neighbors = new HashSet<Edge>();
        }

        public T getData () {
            return this.data;
        }

    }
    // Edge class that holds information on which Node is a neighbor of the Node it points from. It also contains a weight value that is a double.
    protected class Edge {

        protected Vertex toward;

        protected double weight;

        protected Edge (Vertex v, double w) {
            this.toward = v;
            this.weight = w;
        }

        protected Edge (Vertex v) {
            this.toward = v;
            this.weight = 1.0;
        }

    }


    /*
        METHODS
     */


    // Adds a Vertex to the graph using the data value provided.
    public void addVertex (T data) {
        this.vertices.add(new Vertex<T>(data));
    }

    // Adds an Edge between two Vertex with a default weight of 1.
    public void addEdge (Vertex to, Vertex from) {
        from.neighbors.add(new Edge(to));
        to.neighbors.add(new Edge(from));
    }

    // Adds an Edge between two Vertex with a provided weight.
    public void addEdge (Vertex to, Vertex from, double w) {
        from.neighbors.add(new Edge(to, w));
        to.neighbors.add(new Edge(from, w));
    }

    // Gets the set of all Vertex in the graph.
    public Set<Vertex<T>> getVertices () {
        return this.vertices;
    }

    // Gets the set of all Edges from a specific Vertex, (Edges contain Destination and Weight).
    public Set getNeighbors (Vertex v) {
        return v.neighbors;
    }

    // Gets the size of the graph. Number of vertices in the graph.
    public int size () {
        return this.vertices.size();
    }
}