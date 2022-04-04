package CodeChallenges.Challenge18;


import java.util.List;

public class App {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new Node(5);
        tree.root.left = new Node(15);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(9);
        List<Object> treeObject = tree.traverse();
        for (Object object : treeObject) {
            System.out.println(object);
        }
        Tree resultTree = FizzBuzzTree.fizzBuzz(tree, tree.root);

        System.out.println("*****************");
        List<Object> resultObject = resultTree.traverse();
        for (Object object : resultObject) {
            System.out.println(object);
        }


    }


}
