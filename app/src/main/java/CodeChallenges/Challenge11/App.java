package CodeChallenges.Challenge11;

import CodeChallenges.Challenge10.Stack;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PseudoQueue pseudoQueue = new PseudoQueue();
        int input;
        System.out.println("Please enter 3 values");
        for (int i = 0; i < 3; i++) {
            input = scanner.nextInt();
        }
        System.out.println("The extract form the queue is => " + pseudoQueue.dequeue());
    }
}
