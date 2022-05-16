package CodeChallenges.Challenge32;

import CodeChallenges.Challenge15_16_17.BinaryTree;
import CodeChallenges.Challenge15_16_17.Node;
import CodeChallenges.Challenge32.TreeIntersection.TreeIntersection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {


    @Test
    @DisplayName("Hash Table Tree insertion Test")
    void hashTableTreeInsertionTest(){

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new Node(150);
        binaryTree.root.left = new Node(100);
        binaryTree.root.right = new Node(250);
        binaryTree.root.left.left = new Node(75);
        binaryTree.root.left.right = new Node(160);
        binaryTree.root.right.right = new Node(350);
        binaryTree.root.right.left = new Node(200);
        binaryTree.root.left.right.left = new Node(125);
        binaryTree.root.left.right.right = new Node(175);
        binaryTree.root.right.right.left = new Node(300);
        binaryTree.root.right.right.right = new Node(500);

        BinaryTree binaryTree2 = new BinaryTree();

        binaryTree2.root = new Node(42);
        binaryTree2.root.left = new Node(100);
        binaryTree2.root.right = new Node(600);
        binaryTree2.root.left.left = new Node(15);
        binaryTree2.root.left.right = new Node(160);
        binaryTree2.root.right.right = new Node(350);
        binaryTree2.root.right.left = new Node(200);
        binaryTree2.root.left.right.left = new Node(125);
        binaryTree2.root.left.right.right = new Node(175);
        binaryTree2.root.right.right.left = new Node(4);
        binaryTree2.root.right.right.right = new Node(500);

        String actual = TreeIntersection.tree_intersection(binaryTree,binaryTree2).toString();
        String expected = "[100, 160, 200, 350, 125, 175, 500]";


        assertEquals(expected,actual);
    }
}
