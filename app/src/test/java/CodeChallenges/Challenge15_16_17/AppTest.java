package CodeChallenges.Challenge15_16_17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;


public class AppTest {
        BinaryTree binaryTree;
        BinarySearchTree binarySearchTree;

        @BeforeEach
    void setUp(){

            binarySearchTree = new BinarySearchTree();
            binaryTree = new BinaryTree();
        }


    @Test
    @DisplayName("Binary search tree test")
    void binarySearchTreeTest(){

        List<String> excepted = new ArrayList<>();
        List<String> actual = new ArrayList<>();


        binarySearchTree.add(10);
        binarySearchTree.add(20);
        binarySearchTree.add(30);
        binarySearchTree.add(40);

        assertTrue(binarySearchTree.contains(10));
        assertTrue(binarySearchTree.contains(20));
        assertTrue(binarySearchTree.contains(30));
        assertTrue(binarySearchTree.contains(40));
        assertFalse(binarySearchTree.contains(15));
        assertEquals(40, binarySearchTree.findMaxBST());


        binaryTree.root = new Node(2);
        binaryTree.root.left = new Node(7);
        binaryTree.root.right = new Node(5);
        binaryTree.root.left.right = new Node(6);
        binaryTree.root.left.left = new Node(2);
        binaryTree.root.left.right.left = new Node(5);
        binaryTree.root.left.right.right = new Node(11);
        binaryTree.root.right.right = new Node(9);
        binaryTree.root.right.right.left = new Node(4);
        assertEquals(11, binaryTree.findMax(binaryTree.root));

        actual.add(binaryTree.breadthFirst(binaryTree).toString());
        excepted.add("[2, 7, 5, 2, 6, 9, 5, 11, 4]");


        assertLinesMatch(excepted,actual);

    }





}
