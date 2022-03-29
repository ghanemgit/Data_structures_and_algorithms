package CodeChallenges.Challenge15;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int input;

        System.out.println("Welcome to our Tree data structures system Please add value to new tree");
        for (int i = 0; i < 4; i++) {
            input = scanner.nextInt();
            binarySearchTree.add(input);
        }
        System.out.print("Your Tree is => ");
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println("\nEnter the value you want to look for");
        input=scanner.nextInt();
        if (binarySearchTree.contains(input))
            System.out.println("The value "+input+" founded");
        else
            System.out.println("Sorry the value you entered is not found");



    }


}
