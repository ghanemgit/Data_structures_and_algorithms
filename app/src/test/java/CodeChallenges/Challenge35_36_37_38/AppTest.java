package CodeChallenges.Challenge35_36_37_38;

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


    ////////////////////////////////////////////////////Challenge36\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

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



    ////////////////////////////////////////////////////Challenge37\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @Test
    @DisplayName("Graph business trip test")
    void businessTripTest(){
        Graph graph = new Graph();


        Node node = graph.addNode("Pandora");
        Node node1 = graph.addNode("Arendelle");
        Node node2 = graph.addNode("Metroville");
        Node node3 = graph.addNode("Monstroplolis");
        Node node4 = graph.addNode("Narnia");
        Node node5 = graph.addNode("Naboo");


        graph.addEdgesWithWeight(node,node1,150);
        graph.addEdgesWithWeight(node1,node2,99);
        graph.addEdgesWithWeight(node1,node3,42);
        graph.addEdgesWithWeight(node2,node4,37);
        graph.addEdgesWithWeight(node2,node5,26);
        graph.addEdgesWithWeight(node2,node3,105);
        graph.addEdgesWithWeight(node3,node5,73);
        graph.addEdgesWithWeight(node4,node5,250);


        String[] cityNames1 = {"Arendelle", "Monstroplolis", "Naboo"};
        String[] cityNames2 = {"Naboo", "Pandora"};
        String[] cityNames3 = {"Narnia", "Arendelle", "Naboo"};



        assertEquals(115,graph.businessTrip(graph,cityNames1));
        assertEquals(0,graph.businessTrip(graph,cityNames2));
        assertEquals(0,graph.businessTrip(graph,cityNames3));

    }

    ////////////////////////////////////////////////////Challenge38\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//


    @Test
    @DisplayName("Graph depth first test")
    void depthFirstTraversalTest(){
        Graph graph = new Graph();

        Node nodeA = graph.addNode("A");
        Node nodeB = graph.addNode("B");
        Node nodeC = graph.addNode("C");
        Node nodeG = graph.addNode("G");
        Node nodeD = graph.addNode("D");
        Node nodeE = graph.addNode("E");
        Node nodeF = graph.addNode("F");
        Node nodeH = graph.addNode("H");


        graph.addEdges(nodeA,nodeB);
        graph.addEdges(nodeA,nodeD);
        graph.addEdges(nodeB,nodeD);
        graph.addEdges(nodeB,nodeC);
        graph.addEdges(nodeC,nodeG);
        graph.addEdges(nodeD,nodeF);
        graph.addEdges(nodeD,nodeH);
        graph.addEdges(nodeD,nodeE);
        graph.addEdges(nodeF,nodeH);

        assertEquals("[A, D, E, H, F, B, C, G]",graph.depthFirstTraversal(nodeA).toString());
    }
}
