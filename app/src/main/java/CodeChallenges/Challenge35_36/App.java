package CodeChallenges.Challenge35_36;

public class App {

    public static void main(String[] args) {

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

    }
}
