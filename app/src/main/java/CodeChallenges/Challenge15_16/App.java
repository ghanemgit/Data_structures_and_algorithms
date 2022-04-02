package CodeChallenges.Challenge15_16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinarySearchTree binarySearchTree = new BinarySearchTree();

 ///////////////////////////////////////////Challenge15\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//        int input;
//
//        System.out.println("Welcome to our Tree data structures system Please add value to new tree");
//        for (int i = 0; i < 4; i++) {
//            input = scanner.nextInt();
//            binarySearchTree.add(input);
//        }
//        System.out.print("Your Tree is => ");
//        binarySearchTree.preOrder(binarySearchTree.root);
//        System.out.println("\nEnter the value you want to look for");
//        input=scanner.nextInt();
//        if (binarySearchTree.contains(input))
//            System.out.println("The value "+input+" founded");
//        else
//            System.out.println("Sorry the value you entered is not found");
///////////////////////////////////////////Challenge16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(9);
        tree.root.left.right.left = new Node(5);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right.left = new Node(4);
        System.out.println("The maximum value in the tree is => "+tree.findMax(tree.root));

///////////////////////////////////////////Challenge17\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    }


}
