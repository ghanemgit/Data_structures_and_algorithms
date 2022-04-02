package CodeChallenges.Challenge15_16;

import java.util.ArrayList;
import java.util.List;
import CodeChallenges.Challenge10.Queue;

public class BinaryTree {

    List<Integer> list = new ArrayList<>();
    Queue queue = new Queue();

    Node root;

    public void preOrder(Node node){//Root - Left - right
        if (node == null) {
            System.err.println("Sorry the tree is empty");
        }
        else {
            System.out.print("{ "+node.data+" } => ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void inOrder(Node node){//Left - Root - Right
        if (node == null)
            System.out.println("The tree is empty");
        else {
            inOrder(node.left);
            System.out.println("{ "+node.data+" }");
            inOrder(node.right);
        }
    }
    public void postOrder(Node node){//Left - Right - Root
        if (node == null)
            System.out.println("The tree is empty");
        else {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

/////////////////////////////////////////////////////////Challenge16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


    public int findMax(Node node){

        int max,maxLeft,maxRight;

        if (node == null)
            return 0;

        max = node.data;
        maxLeft = findMax(node.left);
        maxRight = findMax(node.right);

        if (maxLeft > maxRight)
            max = maxLeft;
        if (maxRight > max)
            max = maxRight;

        return max;
    }

/////////////////////////////////////////////////////////Challenge17\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\




}
