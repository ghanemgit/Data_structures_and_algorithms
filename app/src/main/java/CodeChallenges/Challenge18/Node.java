package CodeChallenges.Challenge18;

public class Node {

    public Object value;
    public Node left;
    public Node right;


    public Node(Object value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }


    @Override
    public String toString() {
        return "data=" + value + " right= " + right + " left= " + left + " | ";
    }

}
