package CodeChallenges.Challenge35;

public class App {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdges(new Node("A"),new Node("B"));
        graph.addEdges(new Node("B"),new Node("C"));
        graph.addEdges(new Node("A"),new Node("C"));

        System.out.println(graph.printGraph());

        System.out.println("The size of graph is => "+graph.getSize());
        graph.deleteNode("B");
        graph.deleteEdge("A","B");
        System.out.println("The size of graph is after delete => "+graph.getSize());



        System.out.println(graph.breadthFirstSearch(graph,"A"));

    }
}
