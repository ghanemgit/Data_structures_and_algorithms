package CodeChallenges.Challenge35;

import java.util.*;

public class Graph {

    private Map<Node, List<Node>> nodeListMap;

    public Graph() {
        this.nodeListMap = new HashMap<>();
    }

    public Node addNode(String data){
        Node node = new Node(data);
        nodeListMap.putIfAbsent(node,new ArrayList<>());
        return node;
    }

    public void addEdges(Node node1,Node node2){

        nodeListMap.get(node1).add(node2);
        nodeListMap.get(node2).add(node1);
    }

    public String printGraph(){

        StringBuilder stringBuilder = new StringBuilder();

        for (Node node :
                nodeListMap.keySet()) {
            stringBuilder.append(node);
            stringBuilder.append(nodeListMap.get(node));
        }
        return stringBuilder.toString();
    }

    public void deleteNode(String data){

        Node node = new Node(data);
        nodeListMap.values().forEach(nodes -> nodes.remove(node));
        nodeListMap.remove(node);
    }

    public void deleteEdge(String data1,String data2){

        Node node1 = new Node(data1);
        Node node2 = new Node(data2);

        List<Node> edgesList1 = nodeListMap.get(node1);
        List<Node> edgesList2 = nodeListMap.get(node2);

        if (!edgesList1.isEmpty()){
            edgesList1.remove(node2);
        }else if (!edgesList2.remove(node1)){
            edgesList2.remove(node1);
        }
    }

    public Set<String> breadthFirstSearch(Graph graph,String root){

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);

        while (!queue.isEmpty()){
            String node = queue.poll();
            for (Node n :
                    graph.getNodes(node)) {
                if (!visited.contains(n.data)){
                    queue.add(n.data);
                    visited.add(n.data);
                }
            }
        }
        return visited;
    }

    public List<Node> getNodes(String data){
        return nodeListMap.get(new Node(data));
    }

    public HashSet<Node> getNeighbors(Node node){
        return node.neighbors;
    }

    public int getSize(){
        return this.nodeListMap.size();
    }
}
