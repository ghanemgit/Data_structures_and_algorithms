package CodeChallenges.Challenge15_16;

public class BinaryTree {


    void preOrder(Node node){//Root - Left - right
        if (node == null)
            return;
        else {
            System.out.print("{ "+node.data+" } => ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    void inOrder(Node node){//Left - Root - Right
        if (node == null)
            System.out.println("The tree is empty");
        else {
            inOrder(node.left);
            System.out.println("{ "+node.data+" }");
            inOrder(node.right);
        }
    }
    void postOrder(Node node){//Left - Right - Root
        if (node == null)
            System.out.println("The tree is empty");
        else {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

}
