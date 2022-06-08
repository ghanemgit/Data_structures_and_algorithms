package CodeChallenges.Challenge35_36_37_38;

public class App {

    public static void main(String[] args) {

        ////////////////////////////////////////////////////Challenge38\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
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

        System.out.println("Is the two node connected -> "+ CodeChallenges.Temp.App.isNodesConnected(graph,nodeA,nodeH));

    }
}


/*
        ////////////////////////////////////////////////////Challenge35-36\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

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

        System.out.println(graph.printGraph());

        System.out.println("The size of graph is => "+graph.getSize());

        System.out.println(graph.getNeighbors(node3));

        System.out.println("The size of graph is after delete => "+graph.getSize());

        System.out.println(graph.breadthFirst(node));
*
*/

/*
        ////////////////////////////////////////////////////Challenge37\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

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

        System.out.println("Trip Cost for trip 1 Is => $"+graph.businessTrip(graph,cityNames1));
        System.out.println("Trip Cost for trip 2 Is => $"+graph.businessTrip(graph,cityNames2));
        System.out.println("Trip Cost for trip 3 Is => $"+graph.businessTrip(graph,cityNames3));
 */