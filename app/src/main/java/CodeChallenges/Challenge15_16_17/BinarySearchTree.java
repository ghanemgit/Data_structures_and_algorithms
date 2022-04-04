package CodeChallenges.Challenge15_16_17;

public class BinarySearchTree extends BinaryTree{

        Node root;


    public Node add(Node node,int value){

        if (node == null){
            Node newNode = new Node(value);
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
    /////////////////////////////////////////////////////////Challenge16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public Node findMaxBST(Node node){

        if (node == null){
            return null;
        }
        else if (node.right == null){
            return node;
        }else {
            return findMaxBST(node.right);
        }
    }

    public int findMaxBST(){
        Node result = findMaxBST(root);
        return  result.data;
    }





}
