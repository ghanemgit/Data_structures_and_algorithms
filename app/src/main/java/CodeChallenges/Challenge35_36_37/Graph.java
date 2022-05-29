package CodeChallenges.Challenge35_36_37;

import java.util.*;

public class Graph {

    private Map<Node, List<Node>> nodeListMap;
    private int cost;

    public Graph() {
        this.nodeListMap = new HashMap<>();
    }

    public Node addNode(String data) {
        Node node = new Node(data);
        nodeListMap.putIfAbsent(node, new ArrayList<>());
        return node;
    }

    public void addEdges(Node node1, Node node2) {

        nodeListMap.get(node1).add(node2);
        nodeListMap.get(node2).add(node1);
    }

    public void addEdgesWithWeight(Node node1, Node node2, int weight) {

        Node newNode1 = new Node(node1.data,weight);
        Node newNode2 = new Node(node2.data,weight);

        nodeListMap.get(newNode1).add(newNode2);
        nodeListMap.get(newNode2).add(newNode1);
    }

    public String printGraph() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Node node :
                nodeListMap.keySet()) {
            stringBuilder.append(node);
            stringBuilder.append(nodeListMap.get(node));
        }
        return stringBuilder.toString();
    }

    public void deleteNode(String data) {

        Node node = new Node(data);
        nodeListMap.values().forEach(nodes -> nodes.remove(node));
        nodeListMap.remove(node);
    }

    public void deleteEdge(String data1, String data2) {

        Node node1 = new Node(data1);
        Node node2 = new Node(data2);

        List<Node> edgesList1 = nodeListMap.get(node1);
        List<Node> edgesList2 = nodeListMap.get(node2);

        if (!edgesList1.isEmpty()) {
            edgesList1.remove(node2);
        } else if (!edgesList2.remove(node1)) {
            edgesList2.remove(node1);
        }
    }


    //Returns a collection of edges connected to the given node
    public List<Node> getNeighbors(Node node) {
        if (nodeListMap.containsKey(node)) {
            return nodeListMap.get(node);
        }
        return null;
    }

    public List<Node> getNodes(String data) {
        return nodeListMap.get(new Node(data));
    }


    public int getSize() {
        return this.nodeListMap.size();
    }


    ////////////////////////////////////////////////////Challenge36\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public Set<String> breadthFirst(Node node) {

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(node.data);
        visited.add(node.data);

        while (!queue.isEmpty()) {
            String nodeString = queue.poll();
            for (Node n :
                    getNodes(nodeString)) {
                if (!visited.contains(n.data)) {
                    queue.add(n.data);
                    visited.add(n.data);
                }
            }
        }
        return visited;
    }

    ////////////////////////////////////////////////////Challenge37\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public int businessTrip(Graph tripGraph, String[] cities) {

        cost = 0;
        int arraySize = cities.length;

        for (int i = 0; i < arraySize - 1; i++) {
            distance(cities[i], cities[i + 1], tripGraph);
        }
        return cost;
    }

    private void distance(String city1, String city2, Graph graph) {
        if (graph.getNeighbors(city1) == null) {
            return;
        }
        for (Node nodes : graph.getNeighbors(city1)) {
            if (Objects.equals(city2, nodes.data)) {
                cost = cost + nodes.weight;
            }
        }
    }

    public List<Node> getNeighbors(String data) {
        return nodeListMap.get(new Node(data));
    }

}
