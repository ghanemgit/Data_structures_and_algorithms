package CodeChallenges.Challenge18;

public class FizzBuzzTree {

    public static Tree fizzBuzz(Tree tree, Node node) {

        if (node != null) {
            if (((int) node.value % 15) == 0) {
                node.value = "FizzBuzz";
            } else if (((int) node.value % 5) == 0) {
                node.value = "Buzz";
            } else if (((int) node.value % 3) == 0) {
                node.value = "Fizz";
            }
            if (tree.root.left != null) {
                fizzBuzz(tree, node.left);
            }
            if (tree.root.right != null) {
                fizzBuzz(tree, node.right);
            }
        }
        return tree;
    }
}

