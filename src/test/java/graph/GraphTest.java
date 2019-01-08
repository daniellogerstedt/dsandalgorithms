package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddVertex() {
        Graph<String> testGraph = new Graph<>();
        assertEquals(0, testGraph.size());
        testGraph.addVertex("New Test Vertex");
        assertEquals(1, testGraph.size());
        assertEquals("New Test Vertex", testGraph.getVertices().toArray(new Graph.Vertex[testGraph.size()])[0].getData());
    }

    @Test
    public void testAddEdge() {
        Graph<String> testGraph = new Graph<>();
        Graph.Vertex nodeOne = testGraph.addVertex("Test Vertex One");
        Graph.Vertex nodeTwo = testGraph.addVertex("Test Vertex Two");
        testGraph.addEdge(nodeOne, nodeTwo);
        assertEquals(1, nodeOne.neighbors.size());
        assertEquals(1, nodeTwo.neighbors.size());

        // Check Vertex One for Neighbors
        Object[] neighborsOne = nodeOne.neighbors.toArray();
        assertEquals("Test Vertex Two", ((Graph.Edge)neighborsOne[0]).toward.data);
        assertTrue(((Graph.Edge)neighborsOne[0]).weight == 1.0);

        // Check Vertex Two for Neighbors
        Object[] neighborsTwo = nodeTwo.neighbors.toArray();
        assertEquals("Test Vertex One", ((Graph.Edge)neighborsTwo[0]).toward.data);
        assertTrue(((Graph.Edge)neighborsTwo[0]).weight == 1.0);
    }

    @Test
    public void testAddWeightedEdge() {
        Graph<String> testGraph = new Graph<>();
        Graph.Vertex nodeOne = testGraph.addVertex("Test Vertex One");
        Graph.Vertex nodeTwo = testGraph.addVertex("Test Vertex Two");
        testGraph.addEdge(nodeOne, nodeTwo, 0.5);
        assertEquals(1, nodeOne.neighbors.size());
        assertEquals(1, nodeTwo.neighbors.size());

        // Check Vertex One for Neighbors
        Object[] neighborsOne = nodeOne.neighbors.toArray();
        assertEquals("Test Vertex Two", ((Graph.Edge)neighborsOne[0]).toward.data);
        assertTrue(((Graph.Edge)neighborsOne[0]).weight == 0.5);

        // Check Vertex Two for Neighbors
        Object[] neighborsTwo = nodeTwo.neighbors.toArray();
        assertEquals("Test Vertex One", ((Graph.Edge)neighborsTwo[0]).toward.data);
        assertTrue(((Graph.Edge)neighborsTwo[0]).weight == 0.5);
    }

    @Test
    public void testGetVertices() {
        Graph<String> testGraph = new Graph<>();
        testGraph.addVertex("Test Vertex One");
        testGraph.addVertex("Test Vertex Two");
        Graph.Vertex[] vertices = testGraph.getVertices().toArray(new Graph.Vertex[testGraph.size()]);
        assertEquals("Test Vertex One", vertices[0].data);
        assertEquals("Test Vertex Two", vertices[1].data);

    }

    @Test
    public void testGetNeighbors() {
        Graph<String> testGraph = new Graph<>();
        Graph.Vertex nodeOne = testGraph.addVertex("Test Vertex One");
        Graph.Vertex nodeTwo = testGraph.addVertex("Test Vertex Two");
        testGraph.addEdge(nodeOne, nodeTwo);

        // Check for neighbors of One and Two has size of 1.
        assertEquals(1, testGraph.getNeighbors(nodeOne).size());
        assertEquals(1, testGraph.getNeighbors(nodeTwo).size());

        // Check Vertex One for Neighbors
        Object[] neighborsOne = testGraph.getNeighbors(nodeOne).toArray();
        assertEquals("Test Vertex Two", ((Graph.Edge)neighborsOne[0]).toward.data);
        assertTrue(((Graph.Edge)neighborsOne[0]).weight == 1.0);

        // Check Vertex Two for Neighbors
        Object[] neighborsTwo = testGraph.getNeighbors(nodeTwo).toArray();
        assertEquals("Test Vertex One", ((Graph.Edge)neighborsTwo[0]).toward.data);
        assertTrue(((Graph.Edge)neighborsTwo[0]).weight == 1.0);

    }

    @Test
    public void testSize() {
        Graph<String> testGraph = new Graph<>();
        assertEquals(0, testGraph.size());
        testGraph.addVertex("Test Vertex One");

        assertEquals(1, testGraph.size());
        testGraph.addVertex("Test Vertex Two");

        assertEquals(2, testGraph.size());
    }
}