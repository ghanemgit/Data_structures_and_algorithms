package CodeChallenges.Challenge15;

public class BinarySearchTree extends BinaryTree{

        Node root;


    public Node add(Node node,int value){

        if (node == null){
            Node newNode = new Node();
            newNode.data = value;
            node = newNode;
        }
        else if (value < node.data)
        {
          node.left = add(node.left,value);
        }else {
          node.right = add(node.right,value);
        }

        return node;

    }
    void add(int value)
    {
        root = add(root, value);
    }



    public Node contains(Node node,int value){

        if(node == null){
            return null;

        } else if (value < node.data){
            return contains(node.left,value);
        }else if (value == node.data){
            return  node;
        }else {
            return contains(node.right,value);
        }
    }
    boolean contains(int value)
    {
        Node result = contains(root, value);

        return result != null;
    }


}
