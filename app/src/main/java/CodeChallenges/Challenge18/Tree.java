package CodeChallenges.Challenge18;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    public Node root;

    public Tree() {
    }

    public Tree(Node node) {
        this.root = node;
    }

    public List<Object> traverse() {
        List<Object> list = new ArrayList<>();
        return traverseHelper(list, this.root);
    }

    private List<Object> traverseHelper(List<Object> list, Node node) {
        if (node != null) {
            traverseHelper(list, node.left);
            list.add(node.value);
            traverseHelper(list, node.right);
        }
        return list;
    }


}
