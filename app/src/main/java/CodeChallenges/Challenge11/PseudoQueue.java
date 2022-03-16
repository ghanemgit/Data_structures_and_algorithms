package CodeChallenges.Challenge11;

import CodeChallenges.Challenge10.Node;
import CodeChallenges.Challenge10.Stack;

public class PseudoQueue {

    Stack stack;
    Node pointer;


    public PseudoQueue() {

        stack = new Stack();
        pointer = new Node();

    }

    public String enqueue(int value) {

        stack.push(value);
        return stack.printAll();
    }


    public int dequeue() {

        return  stack.pop();
    }

}
