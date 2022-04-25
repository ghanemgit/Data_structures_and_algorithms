package CodeChallenges.Challenge19;

import java.io.File;

public class Node {

    public File file;
    public Node left;
    public Node right;


    public Node(Object value) {
        this.right = null;
        this.left = null;
    }


    @Override
    public String toString() {
        return " right= " + right + " left= " + left + " | ";
    }

}
