package CodeChallenges.Challenge35;

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
}
