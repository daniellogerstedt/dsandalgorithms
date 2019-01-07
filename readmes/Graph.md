## January 7th 2019: Graphs.

[code](../src/main/java/graph/Graph.java)
[test](../src/test/java/graph/GraphTest.java)

### Challenge:

Implement a graph. The graph should have access to adding Vertices (Nodes) and Edges (Connections between nodes). The graph should also have a method to get all Vertices in the graph, get all Neighbors of a specific Vertex, and get the size of the graph (Number of Vertices)

### Approach and Efficiency:

The graph implemented contains two private classes for Vertex and Edges:

#### Vertex
The Vertex class contains information on data and neighbors connected to it. The data is a generic type of T while the neighbors is a set of edges.

#### Edge
The Edge class contains the vertex it points to and the weight of the connection. The weight is stored as a double.

The graph also contains the following methods:

#### Add Vertex (addVertex)
This adds a vertex to the graph by creating a new vertex and storing it in the set of vertex present on the graph instance. It takes in data and uses this to create the new vertex

This method is O(1) for Time and Space

#### Add Edge (addEdge)
This method takes in two vertex and adds an edge between the two of them. It does this by creating an edge pointing to each vertex and adding them to the neighbors of the other vertex. This method is overloaded, one takes a weight and the other doesn't. The weight when not provided defaults to 1.0.

This method is O(1) for Time and Space

#### Get Vertices (getVertices)
This method returns the set of vertex present on the instance of the graph.

This method is O(1) for Time and Space

#### Get Neighbors (getNeighbors)
This method takes in a vertex, finds that vertex and returns the set of neighbors on that vertex instance.

This method is O(1) for Time and Space

#### Size (size)
This method returns the size of the set of vertex present on the instance of the graph.

This method is O(1) for Time and Space
