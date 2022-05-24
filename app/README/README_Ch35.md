# Graphs

#### A graph is a common data structure that consists of a finite set of nodes (or vertices) and a set of edges connecting them. A pair (x,y) is referred to as an edge, which communicates that the x node connects to the y node.


## Challenge
#### Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
- Add node.
- Add edge.
- Get nodes.
- Size.


## Approach & Efficiency
#### Today I learned how to implement the graph data structure and make a different process with it like add node, add edge, get nodes, and return the size of graph. I will explain the complexity to each method in the API section.

## API
### addNode() 

- Adds a new node to the graph.
- Takes in the value of that node.
- Returns the added node.
- space => O(n+m) Time => O(1).

 
### addEdge() 

- Adds a new edge between two nodes in the graph.
- Takes in the two nodes to be connected by the edge.
- Both nodes should already be in the Graph.
- space => O(n+m) Time => O(1).


### getNodes() 

- Returns all the nodes in the graph as a collection (set, list, or similar).
- space => O(n) Time => O(n).



### size() 

- Returns the total number of nodes in the graph.
- space => O(n) Time => O(n).


#### Go to code [here](../../app/src/main/java/CodeChallenges/Challenge35)
#### Go to test [here](../../app/src/test/java/CodeChallenges/Challenge35/AppTest.java)