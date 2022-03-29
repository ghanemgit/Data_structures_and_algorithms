package CodeChallenges.Challenge15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class AppTest {

        BinarySearchTree binarySearchTree;

        @BeforeEach
    void setUp(){
            binarySearchTree = new BinarySearchTree();
        }


    @Test
    @DisplayName("Binary search tree test")
    void binarySearchTreeTest(){


        binarySearchTree.add(10);
        binarySearchTree.add(20);
        binarySearchTree.add(30);
        binarySearchTree.add(40);

        assertTrue(binarySearchTree.contains(10));
        assertTrue(binarySearchTree.contains(20));
        assertTrue(binarySearchTree.contains(30));
        assertTrue(binarySearchTree.contains(40));
        assertFalse(binarySearchTree.contains(15));


    }





}
