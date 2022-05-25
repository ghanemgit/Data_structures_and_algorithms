package CodeChallenges.Challenge35_36;

import java.util.HashSet;
import java.util.Objects;

public class Node {

    String data;
    public HashSet<Node> neighbors;


    public Node(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                '}';
    }

    // add new neighbor to existing node with weight
//    public boolean addNeighbor(Node node, int weight){
//
//        //this.neighbors.add(edge);
//        return true;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this == null || getClass() != obj.getClass()) return false;
        Node node = (Node) obj;

        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
