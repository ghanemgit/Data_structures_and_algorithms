package CodeChallenges.Challenge35_36;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    @Test
    @DisplayName("Graph implementation test")
    void GraphImplementationTest(){
        Graph graph = new Graph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdges(new Node("A"),new Node("B"));
        graph.addEdges(new Node("B"),new Node("C"));
        graph.addEdges(new Node("A"),new Node("C"));


        assertEquals(3,graph.getSize());

        graph.deleteNode("B");
        graph.deleteEdge("A","B");

        assertEquals(2,graph.getSize());
    }

    @Test
    @DisplayName("Graph Breadth First test")
    void GraphBreadthFirstTest(){
        Graph graph = new Graph();

        Node node = graph.addNode("Pandora");
        Node node1 = graph.addNode("Arendelle");
        Node node2 = graph.addNode("Metroville");
        Node node3 = graph.addNode("Monstroplolis");
        Node node4 = graph.addNode("Narnia");
        Node node5 = graph.addNode("Naboo");


        graph.addEdges(node,node1);
        graph.addEdges(node1,node2);
        graph.addEdges(node1,node3);
        graph.addEdges(node2,node3);
        graph.addEdges(node2,node4);
        graph.addEdges(node2,node5);
        graph.addEdges(node3,node5);
        graph.addEdges(node4,node5);

        String excepted = "[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]";
        assertEquals(excepted,graph.breadthFirst(node).toString());

    }
}
