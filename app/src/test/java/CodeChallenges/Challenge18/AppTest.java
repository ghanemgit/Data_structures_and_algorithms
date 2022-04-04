package CodeChallenges.Challenge18;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    Tree tree;

    @BeforeEach
    void setUp(){
        tree = new Tree();
    }

    @Test
    @DisplayName("Tree FizzBuzz test")
    void FizzBuzzTreeTest(){

        List<String> excepted = new ArrayList<>();
        List<String> actual = new ArrayList<>();

        excepted.add("Fizz");
        excepted.add("FizzBuzz");
        excepted.add("Buzz");
        excepted.add("4");

        tree.root = new Node(5);
        tree.root.left = new Node(15);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(9);

        Tree resultTree = FizzBuzzTree.fizzBuzz(tree, tree.root);
        List<Object> resultObject = resultTree.traverse();
        for (Object object : resultObject) {
            actual.add(object.toString());
        }

        assertLinesMatch(excepted,actual);

    }






}
