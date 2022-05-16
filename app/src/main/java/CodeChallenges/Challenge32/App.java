package CodeChallenges.Challenge32;

import CodeChallenges.Challenge15_16_17.BinaryTree;
import CodeChallenges.Challenge15_16_17.Node;
import CodeChallenges.Challenge32.TreeIntersection.TreeIntersection;

public class App {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new Node(150);
        binaryTree.root.left = new Node(100);
        binaryTree.root.right = new Node(250);
        binaryTree.root.left.left = new Node(75);
        binaryTree.root.left.right = new Node(160);
        binaryTree.root.right.right = new Node(350);
        binaryTree.root.right.left = new Node(200);
        binaryTree.root.left.right.left = new Node(125);
        binaryTree.root.left.right.right = new Node(175);
        binaryTree.root.right.right.left = new Node(300);
        binaryTree.root.right.right.right = new Node(500);

        BinaryTree binaryTree2 = new BinaryTree();

        binaryTree2.root = new Node(42);
        binaryTree2.root.left = new Node(100);
        binaryTree2.root.right = new Node(600);
        binaryTree2.root.left.left = new Node(15);
        binaryTree2.root.left.right = new Node(160);
        binaryTree2.root.right.right = new Node(350);
        binaryTree2.root.right.left = new Node(200);
        binaryTree2.root.left.right.left = new Node(125);
        binaryTree2.root.left.right.right = new Node(175);
        binaryTree2.root.right.right.left = new Node(4);
        binaryTree2.root.right.right.right = new Node(500);

        System.out.println("The common element between two tree is => "+TreeIntersection.tree_intersection(binaryTree,binaryTree2));

    }
}
