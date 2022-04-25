package CodeChallenges.Challenge19;

import CodeChallenges.Challenge19.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    List<Integer> list = new ArrayList<>();

    Node root;



    public int fileCount(Node node){//Root - Left - right
        int fileCounter=0;
        if (node == null) {
            System.err.println("Sorry the directory is empty");
        }
        else {
            if (node.file.isFile())
                fileCounter++;
            fileCount(node.left);
            fileCount(node.right);
        }
        return fileCounter;
    }

    public boolean isFileEqual(BinaryTree tree,BinaryTree tree2){

        return tree.fileCount(tree.root) == tree2.fileCount(tree2.root);

    }
}










///////////////////////////////////////////////////////////Challenge16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//
//
//    public int findMax(Node node){
//
//        int max,maxLeft,maxRight;
//
//        if (node == null)
//            return 0;
//
//        max = node.data;
//        maxLeft = findMax(node.left);
//        maxRight = findMax(node.right);
//
//        if (maxLeft > maxRight)
//            max = maxLeft;
//        if (maxRight > max)
//            max = maxRight;
//
//        return max;
//    }
//
///////////////////////////////////////////////////////////Challenge17\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//
//
//    public List<Integer> breadthFirst(Node node){
//        if(node == null)
//            System.out.println("Empty tree");
//        else
//        {
//            Queue<CodeChallenges.Challenge15_16_17.Node> q= new LinkedList<>();
//            q.add(node);
//            while(q.peek() != null)
//            {
//                Node node1 = q.remove();
//                list.add(node1.data);
//                if(node1.left != null)
//                    q.add(node1.left);
//                if(node1.right != null)
//                    q.add(node1.right);
//            }
//        }
//        return list;
//    }
//
//    public List<Integer> breadthFirst(BinaryTree tree){
//
//        return tree.breadthFirst(tree.root);
//
//
//    }
