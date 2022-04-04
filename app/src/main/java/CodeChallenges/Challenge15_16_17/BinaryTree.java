package CodeChallenges.Challenge15_16_17;

import java.util.*;

public class BinaryTree {

    List<Integer> list = new ArrayList<>();

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


    public List<Integer> breadthFirst(Node node){
        if(node == null)
            System.out.println("Empty tree");
        else
        {
            Queue<Node> q= new LinkedList<>();
            q.add(node);
            while(q.peek() != null)
            {
                Node node1 = q.remove();
                list.add(node1.data);
                if(node1.left != null)
                    q.add(node1.left);
                if(node1.right != null)
                    q.add(node1.right);
            }
        }
        return list;
    }

    public List<Integer> breadthFirst(BinaryTree tree){

        return tree.breadthFirst(tree.root);


    }

}
